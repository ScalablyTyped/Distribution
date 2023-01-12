package typings.raty

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryRatyOptions extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var cancelClass: js.UndefOr[String] = js.undefined
  
  var cancelHint: js.UndefOr[String] = js.undefined
  
  var cancelOff: js.UndefOr[String] = js.undefined
  
  var cancelOn: js.UndefOr[String] = js.undefined
  
  var cancelPlace: js.UndefOr[String] = js.undefined
  
  var click: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.undefined
  
  var half: js.UndefOr[Boolean] = js.undefined
  
  var halfShow: js.UndefOr[Boolean] = js.undefined
  
  var hints: js.UndefOr[js.Array[String]] = js.undefined
  
  var iconRange: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  var mouseout: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.undefined
  
  var mouseover: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.undefined
  
  var noRatedMsg: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[Double] = js.undefined
  
  var numberMax: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var precision: js.UndefOr[Boolean] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var round: js.UndefOr[JQueryRatyRoundingOptions] = js.undefined
  
  var score: js.UndefOr[Double] = js.undefined
  
  var scoreName: js.UndefOr[String] = js.undefined
  
  var single: js.UndefOr[Boolean] = js.undefined
  
  var space: js.UndefOr[Boolean] = js.undefined
  
  var starHalf: js.UndefOr[String] = js.undefined
  
  var starOff: js.UndefOr[String] = js.undefined
  
  var starOn: js.UndefOr[String] = js.undefined
  
  var starType: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var targetFormat: js.UndefOr[String] = js.undefined
  
  var targetKeep: js.UndefOr[Boolean] = js.undefined
  
  var targetScore: js.UndefOr[String] = js.undefined
  
  var targetText: js.UndefOr[String] = js.undefined
  
  var targetType: js.UndefOr[String] = js.undefined
}
object JQueryRatyOptions {
  
  inline def apply(): JQueryRatyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryRatyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryRatyOptions] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelClass(value: String): Self = StObject.set(x, "cancelClass", value.asInstanceOf[js.Any])
    
    inline def setCancelClassUndefined: Self = StObject.set(x, "cancelClass", js.undefined)
    
    inline def setCancelHint(value: String): Self = StObject.set(x, "cancelHint", value.asInstanceOf[js.Any])
    
    inline def setCancelHintUndefined: Self = StObject.set(x, "cancelHint", js.undefined)
    
    inline def setCancelOff(value: String): Self = StObject.set(x, "cancelOff", value.asInstanceOf[js.Any])
    
    inline def setCancelOffUndefined: Self = StObject.set(x, "cancelOff", js.undefined)
    
    inline def setCancelOn(value: String): Self = StObject.set(x, "cancelOn", value.asInstanceOf[js.Any])
    
    inline def setCancelOnUndefined: Self = StObject.set(x, "cancelOn", js.undefined)
    
    inline def setCancelPlace(value: String): Self = StObject.set(x, "cancelPlace", value.asInstanceOf[js.Any])
    
    inline def setCancelPlaceUndefined: Self = StObject.set(x, "cancelPlace", js.undefined)
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setClick(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setHalf(value: Boolean): Self = StObject.set(x, "half", value.asInstanceOf[js.Any])
    
    inline def setHalfShow(value: Boolean): Self = StObject.set(x, "halfShow", value.asInstanceOf[js.Any])
    
    inline def setHalfShowUndefined: Self = StObject.set(x, "halfShow", js.undefined)
    
    inline def setHalfUndefined: Self = StObject.set(x, "half", js.undefined)
    
    inline def setHints(value: js.Array[String]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setHintsVarargs(value: String*): Self = StObject.set(x, "hints", js.Array(value*))
    
    inline def setIconRange(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "iconRange", value.asInstanceOf[js.Any])
    
    inline def setIconRangeUndefined: Self = StObject.set(x, "iconRange", js.undefined)
    
    inline def setIconRangeVarargs(value: js.Array[Any]*): Self = StObject.set(x, "iconRange", js.Array(value*))
    
    inline def setMouseout(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction2(value))
    
    inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    inline def setMouseover(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction2(value))
    
    inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
    
    inline def setNoRatedMsg(value: String): Self = StObject.set(x, "noRatedMsg", value.asInstanceOf[js.Any])
    
    inline def setNoRatedMsgUndefined: Self = StObject.set(x, "noRatedMsg", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberMax(value: Double): Self = StObject.set(x, "numberMax", value.asInstanceOf[js.Any])
    
    inline def setNumberMaxUndefined: Self = StObject.set(x, "numberMax", js.undefined)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPrecision(value: Boolean): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRound(value: JQueryRatyRoundingOptions): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreName(value: String): Self = StObject.set(x, "scoreName", value.asInstanceOf[js.Any])
    
    inline def setScoreNameUndefined: Self = StObject.set(x, "scoreName", js.undefined)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    inline def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setStarHalf(value: String): Self = StObject.set(x, "starHalf", value.asInstanceOf[js.Any])
    
    inline def setStarHalfUndefined: Self = StObject.set(x, "starHalf", js.undefined)
    
    inline def setStarOff(value: String): Self = StObject.set(x, "starOff", value.asInstanceOf[js.Any])
    
    inline def setStarOffUndefined: Self = StObject.set(x, "starOff", js.undefined)
    
    inline def setStarOn(value: String): Self = StObject.set(x, "starOn", value.asInstanceOf[js.Any])
    
    inline def setStarOnUndefined: Self = StObject.set(x, "starOn", js.undefined)
    
    inline def setStarType(value: String): Self = StObject.set(x, "starType", value.asInstanceOf[js.Any])
    
    inline def setStarTypeUndefined: Self = StObject.set(x, "starType", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetFormat(value: String): Self = StObject.set(x, "targetFormat", value.asInstanceOf[js.Any])
    
    inline def setTargetFormatUndefined: Self = StObject.set(x, "targetFormat", js.undefined)
    
    inline def setTargetKeep(value: Boolean): Self = StObject.set(x, "targetKeep", value.asInstanceOf[js.Any])
    
    inline def setTargetKeepUndefined: Self = StObject.set(x, "targetKeep", js.undefined)
    
    inline def setTargetScore(value: String): Self = StObject.set(x, "targetScore", value.asInstanceOf[js.Any])
    
    inline def setTargetScoreUndefined: Self = StObject.set(x, "targetScore", js.undefined)
    
    inline def setTargetText(value: String): Self = StObject.set(x, "targetText", value.asInstanceOf[js.Any])
    
    inline def setTargetTextUndefined: Self = StObject.set(x, "targetText", js.undefined)
    
    inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
