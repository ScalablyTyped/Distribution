package typings.stringLeftRight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-left-right", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chompLeft(str: String, idx: Double, args: Any*): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("chompLeft")((List(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double | Null]
  
  inline def chompRight(str: String, idx: Double, args: Any*): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("chompRight")((List(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double | Null]
  
  inline def left(str: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(str.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def left(str: String, idx: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("left")(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def leftSeq(str: String, idx: Double, args: Any*): SeqOutput | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("leftSeq")((List(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SeqOutput | Null]
  
  inline def leftStopAtNewLines(str: String, idx: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("leftStopAtNewLines")(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def leftStopAtRawNbsp(str: String, idx: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("leftStopAtRawNbsp")(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def right(str: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(str.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def right(str: String, idx: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("right")(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def rightSeq(str: String, idx: Double, args: Any*): SeqOutput | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("rightSeq")((List(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SeqOutput | Null]
  
  inline def rightStopAtNewLines(str: String, idx: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("rightStopAtNewLines")(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def rightStopAtRawNbsp(str: String, idx: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("rightStopAtRawNbsp")(str.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  @JSImport("string-left-right", "version")
  @js.native
  val version: String = js.native
  
  trait Opts extends StObject {
    
    var i: js.UndefOr[Boolean] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setI(value: Boolean): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
    }
  }
  
  trait SeqOutput extends StObject {
    
    var gaps: js.Array[js.Tuple2[Double, Double]]
    
    var leftmostChar: Double
    
    var rightmostChar: Double
  }
  object SeqOutput {
    
    inline def apply(gaps: js.Array[js.Tuple2[Double, Double]], leftmostChar: Double, rightmostChar: Double): SeqOutput = {
      val __obj = js.Dynamic.literal(gaps = gaps.asInstanceOf[js.Any], leftmostChar = leftmostChar.asInstanceOf[js.Any], rightmostChar = rightmostChar.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeqOutput]
    }
    
    extension [Self <: SeqOutput](x: Self) {
      
      inline def setGaps(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
      
      inline def setGapsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "gaps", js.Array(value*))
      
      inline def setLeftmostChar(value: Double): Self = StObject.set(x, "leftmostChar", value.asInstanceOf[js.Any])
      
      inline def setRightmostChar(value: Double): Self = StObject.set(x, "rightmostChar", value.asInstanceOf[js.Any])
    }
  }
}
