package typings.srtparsejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("srtparsejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareTime(timeString: String, startString: String, endString: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTime")(timeString.asInstanceOf[js.Any], startString.asInstanceOf[js.Any], endString.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSrtArrayIndex(srtArray: js.Array[srtArray], startindex: Double, endindex: Double, timeString: String): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSrtArrayIndex")(srtArray.asInstanceOf[js.Any], startindex.asInstanceOf[js.Any], endindex.asInstanceOf[js.Any], timeString.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def parse(srtText: String): js.Array[srtArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(srtText.asInstanceOf[js.Any]).asInstanceOf[js.Array[srtArray]]
  
  inline def setPlayer(srtArray: js.Array[srtArray], setText: js.Function1[/* text */ String, Unit]): srtPlayer = (^.asInstanceOf[js.Dynamic].applyDynamic("setPlayer")(srtArray.asInstanceOf[js.Any], setText.asInstanceOf[js.Any])).asInstanceOf[srtPlayer]
  
  inline def toMS(timeString: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toMS")(timeString.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toSrt(data: js.Array[srtArray]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSrt")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toTime(timeNumber: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTime")(timeNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait srtArray extends StObject {
    
    var endTime: String
    
    var id: String
    
    var startTime: String
    
    var text: String
  }
  object srtArray {
    
    inline def apply(endTime: String, id: String, startTime: String, text: String): srtArray = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[srtArray]
    }
    
    extension [Self <: srtArray](x: Self) {
      
      inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait srtPlayer extends StObject {
    
    def getEndTime(): String
    
    var id: Double
    
    def setText(text: String): Unit
    
    var srtArray: typings.srtparsejs.mod.srtArray
    
    var time: String
    
    def update(time: String): Unit
  }
  object srtPlayer {
    
    inline def apply(
      getEndTime: () => String,
      id: Double,
      setText: String => Unit,
      srtArray: srtArray,
      time: String,
      update: String => Unit
    ): srtPlayer = {
      val __obj = js.Dynamic.literal(getEndTime = js.Any.fromFunction0(getEndTime), id = id.asInstanceOf[js.Any], setText = js.Any.fromFunction1(setText), srtArray = srtArray.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[srtPlayer]
    }
    
    extension [Self <: srtPlayer](x: Self) {
      
      inline def setGetEndTime(value: () => String): Self = StObject.set(x, "getEndTime", js.Any.fromFunction0(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      inline def setSrtArray(value: srtArray): Self = StObject.set(x, "srtArray", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: String => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
