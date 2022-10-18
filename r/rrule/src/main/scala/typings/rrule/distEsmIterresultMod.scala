package typings.rrule

import typings.rrule.anon.PartialIterArgs
import typings.rrule.distEsmTypesMod.IterResultType
import typings.rrule.distEsmTypesMod.QueryMethodTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmIterresultMod {
  
  @JSImport("rrule/dist/esm/iterresult", JSImport.Default)
  @js.native
  open class default[M /* <: QueryMethodTypes */] protected ()
    extends StObject
       with IterResult[M] {
    def this(method: M, args: PartialIterArgs) = this()
    
    /* CompleteClass */
    var _result: js.Array[js.Date] = js.native
    
    /**
      * Possibly adds a date into the result.
      *
      * @param {Date} date - the date isn't necessarly added to the result
      * list (if it is too late/too early)
      * @return {Boolean} true if it makes sense to continue the iteration
      * false if we're done.
      */
    /* CompleteClass */
    override def accept(date: js.Date): Boolean = js.native
    
    /**
      *
      * @param {Date} date that is part of the result.
      * @return {Boolean} whether we are interested in more values.
      */
    /* CompleteClass */
    override def add(date: js.Date): Boolean = js.native
    
    /* CompleteClass */
    override val args: PartialIterArgs = js.native
    
    /**
      * 'before' and 'after' return only one date, whereas 'all'
      * and 'between' an array.
      *
      * @return {Date,Array?}
      */
    /* CompleteClass */
    override def getValue(): IterResultType[M] = js.native
    
    /* CompleteClass */
    override val maxDate: js.Date | Null = js.native
    
    /* CompleteClass */
    override val method: M = js.native
    
    /* CompleteClass */
    override val minDate: js.Date | Null = js.native
    
    /* CompleteClass */
    var total: Double = js.native
  }
  
  trait IterArgs extends StObject {
    
    var _value: js.Date | js.Array[js.Date] | Null
    
    var after: js.Date
    
    var before: js.Date
    
    var dt: js.Date
    
    var inc: Boolean
  }
  object IterArgs {
    
    inline def apply(after: js.Date, before: js.Date, dt: js.Date, inc: Boolean): IterArgs = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], inc = inc.asInstanceOf[js.Any], _value = null)
      __obj.asInstanceOf[IterArgs]
    }
    
    extension [Self <: IterArgs](x: Self) {
      
      inline def setAfter(value: js.Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setDt(value: js.Date): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      inline def setInc(value: Boolean): Self = StObject.set(x, "inc", value.asInstanceOf[js.Any])
      
      inline def set_value(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
      
      inline def set_valueNull: Self = StObject.set(x, "_value", null)
      
      inline def set_valueVarargs(value: js.Date*): Self = StObject.set(x, "_value", js.Array(value*))
    }
  }
  
  trait IterResult[M /* <: QueryMethodTypes */] extends StObject {
    
    var _result: js.Array[js.Date]
    
    /**
      * Possibly adds a date into the result.
      *
      * @param {Date} date - the date isn't necessarly added to the result
      * list (if it is too late/too early)
      * @return {Boolean} true if it makes sense to continue the iteration
      * false if we're done.
      */
    def accept(date: js.Date): Boolean
    
    /**
      *
      * @param {Date} date that is part of the result.
      * @return {Boolean} whether we are interested in more values.
      */
    def add(date: js.Date): Boolean
    
    val args: PartialIterArgs
    
    /**
      * 'before' and 'after' return only one date, whereas 'all'
      * and 'between' an array.
      *
      * @return {Date,Array?}
      */
    def getValue(): IterResultType[M]
    
    val maxDate: js.Date | Null
    
    val method: M
    
    val minDate: js.Date | Null
    
    var total: Double
  }
  object IterResult {
    
    inline def apply[M /* <: QueryMethodTypes */](
      _result: js.Array[js.Date],
      accept: js.Date => Boolean,
      add: js.Date => Boolean,
      args: PartialIterArgs,
      getValue: () => IterResultType[M],
      method: M,
      total: Double
    ): IterResult[M] = {
      val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), add = js.Any.fromFunction1(add), args = args.asInstanceOf[js.Any], getValue = js.Any.fromFunction0(getValue), method = method.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], maxDate = null, minDate = null)
      __obj.asInstanceOf[IterResult[M]]
    }
    
    extension [Self <: IterResult[?], M /* <: QueryMethodTypes */](x: Self & IterResult[M]) {
      
      inline def setAccept(value: js.Date => Boolean): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      inline def setAdd(value: js.Date => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setArgs(value: PartialIterArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setGetValue(value: () => IterResultType[M]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
      
      inline def setMethod(value: M): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def set_result(value: js.Array[js.Date]): Self = StObject.set(x, "_result", value.asInstanceOf[js.Any])
      
      inline def set_resultVarargs(value: js.Date*): Self = StObject.set(x, "_result", js.Array(value*))
    }
  }
}
