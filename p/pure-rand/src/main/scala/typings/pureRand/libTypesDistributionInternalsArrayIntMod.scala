package typings.pureRand

import typings.pureRand.pureRandInts.`-1`
import typings.pureRand.pureRandInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDistributionInternalsArrayIntMod {
  
  @JSImport("pure-rand/lib/types/distribution/internals/ArrayInt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addArrayIntToNew(arrayIntA: ArrayInt, arrayIntB: ArrayInt): ArrayInt = (^.asInstanceOf[js.Dynamic].applyDynamic("addArrayIntToNew")(arrayIntA.asInstanceOf[js.Any], arrayIntB.asInstanceOf[js.Any])).asInstanceOf[ArrayInt]
  
  inline def addOneToPositiveArrayInt(arrayInt: ArrayInt): ArrayInt = ^.asInstanceOf[js.Dynamic].applyDynamic("addOneToPositiveArrayInt")(arrayInt.asInstanceOf[js.Any]).asInstanceOf[ArrayInt]
  
  inline def fromNumberToArrayInt64(out: ArrayInt64, n: Double): ArrayInt64 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumberToArrayInt64")(out.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[ArrayInt64]
  
  inline def substractArrayInt64(out: ArrayInt64, arrayIntA: ArrayInt64, arrayIntB: ArrayInt64): ArrayInt64 = (^.asInstanceOf[js.Dynamic].applyDynamic("substractArrayInt64")(out.asInstanceOf[js.Any], arrayIntA.asInstanceOf[js.Any], arrayIntB.asInstanceOf[js.Any])).asInstanceOf[ArrayInt64]
  
  inline def substractArrayIntToNew(arrayIntA: ArrayInt, arrayIntB: ArrayInt): ArrayInt = (^.asInstanceOf[js.Dynamic].applyDynamic("substractArrayIntToNew")(arrayIntA.asInstanceOf[js.Any], arrayIntB.asInstanceOf[js.Any])).asInstanceOf[ArrayInt]
  
  inline def trimArrayIntInplace(arrayInt: ArrayInt): ArrayInt = ^.asInstanceOf[js.Dynamic].applyDynamic("trimArrayIntInplace")(arrayInt.asInstanceOf[js.Any]).asInstanceOf[ArrayInt]
  
  trait ArrayInt extends StObject {
    
    var data: js.Array[Double]
    
    var sign: `-1` | `1`
  }
  object ArrayInt {
    
    inline def apply(data: js.Array[Double], sign: `-1` | `1`): ArrayInt = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayInt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrayInt] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setSign(value: `-1` | `1`): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<pure-rand.pure-rand/lib/types/distribution/internals/ArrayInt.ArrayInt> & {  data :[number, number]} */
  trait ArrayInt64 extends StObject {
    
    var data: js.Array[Double]
    
    var sign: `-1` | `1`
  }
  object ArrayInt64 {
    
    inline def apply(data: js.Array[Double], sign: `-1` | `1`): ArrayInt64 = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayInt64]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrayInt64] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setSign(value: `-1` | `1`): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
    }
  }
}
