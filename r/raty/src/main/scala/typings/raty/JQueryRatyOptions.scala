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
  
  var iconRange: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
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
  
  @scala.inline
  def apply(): JQueryRatyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryRatyOptions]
  }
  
  @scala.inline
  implicit class JQueryRatyOptionsMutableBuilder[Self <: JQueryRatyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelClass(value: String): Self = StObject.set(x, "cancelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelClassUndefined: Self = StObject.set(x, "cancelClass", js.undefined)
    
    @scala.inline
    def setCancelHint(value: String): Self = StObject.set(x, "cancelHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelHintUndefined: Self = StObject.set(x, "cancelHint", js.undefined)
    
    @scala.inline
    def setCancelOff(value: String): Self = StObject.set(x, "cancelOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelOffUndefined: Self = StObject.set(x, "cancelOff", js.undefined)
    
    @scala.inline
    def setCancelOn(value: String): Self = StObject.set(x, "cancelOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelOnUndefined: Self = StObject.set(x, "cancelOn", js.undefined)
    
    @scala.inline
    def setCancelPlace(value: String): Self = StObject.set(x, "cancelPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelPlaceUndefined: Self = StObject.set(x, "cancelPlace", js.undefined)
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setClick(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setHalf(value: Boolean): Self = StObject.set(x, "half", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfShow(value: Boolean): Self = StObject.set(x, "halfShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfShowUndefined: Self = StObject.set(x, "halfShow", js.undefined)
    
    @scala.inline
    def setHalfUndefined: Self = StObject.set(x, "half", js.undefined)
    
    @scala.inline
    def setHints(value: js.Array[String]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    @scala.inline
    def setHintsVarargs(value: String*): Self = StObject.set(x, "hints", js.Array(value :_*))
    
    @scala.inline
    def setIconRange(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "iconRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconRangeUndefined: Self = StObject.set(x, "iconRange", js.undefined)
    
    @scala.inline
    def setIconRangeVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "iconRange", js.Array(value :_*))
    
    @scala.inline
    def setMouseout(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
    
    @scala.inline
    def setNoRatedMsg(value: String): Self = StObject.set(x, "noRatedMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRatedMsgUndefined: Self = StObject.set(x, "noRatedMsg", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberMax(value: Double): Self = StObject.set(x, "numberMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberMaxUndefined: Self = StObject.set(x, "numberMax", js.undefined)
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPrecision(value: Boolean): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRound(value: JQueryRatyRoundingOptions): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreName(value: String): Self = StObject.set(x, "scoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreNameUndefined: Self = StObject.set(x, "scoreName", js.undefined)
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    @scala.inline
    def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setStarHalf(value: String): Self = StObject.set(x, "starHalf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarHalfUndefined: Self = StObject.set(x, "starHalf", js.undefined)
    
    @scala.inline
    def setStarOff(value: String): Self = StObject.set(x, "starOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarOffUndefined: Self = StObject.set(x, "starOff", js.undefined)
    
    @scala.inline
    def setStarOn(value: String): Self = StObject.set(x, "starOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarOnUndefined: Self = StObject.set(x, "starOn", js.undefined)
    
    @scala.inline
    def setStarType(value: String): Self = StObject.set(x, "starType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarTypeUndefined: Self = StObject.set(x, "starType", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFormat(value: String): Self = StObject.set(x, "targetFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFormatUndefined: Self = StObject.set(x, "targetFormat", js.undefined)
    
    @scala.inline
    def setTargetKeep(value: Boolean): Self = StObject.set(x, "targetKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKeepUndefined: Self = StObject.set(x, "targetKeep", js.undefined)
    
    @scala.inline
    def setTargetScore(value: String): Self = StObject.set(x, "targetScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetScoreUndefined: Self = StObject.set(x, "targetScore", js.undefined)
    
    @scala.inline
    def setTargetText(value: String): Self = StObject.set(x, "targetText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTextUndefined: Self = StObject.set(x, "targetText", js.undefined)
    
    @scala.inline
    def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
