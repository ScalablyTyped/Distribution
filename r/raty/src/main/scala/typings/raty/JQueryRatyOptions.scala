package typings.raty

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryRatyOptions extends js.Object {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var cancelClass: js.UndefOr[String] = js.native
  
  var cancelHint: js.UndefOr[String] = js.native
  
  var cancelOff: js.UndefOr[String] = js.native
  
  var cancelOn: js.UndefOr[String] = js.native
  
  var cancelPlace: js.UndefOr[String] = js.native
  
  var click: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.native
  
  var half: js.UndefOr[Boolean] = js.native
  
  var halfShow: js.UndefOr[Boolean] = js.native
  
  var hints: js.UndefOr[js.Array[String]] = js.native
  
  var iconRange: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  var mouseout: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.native
  
  var mouseover: js.UndefOr[js.Function2[/* score */ Double, /* event */ JQueryEventObject, Unit]] = js.native
  
  var noRatedMsg: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var numberMax: js.UndefOr[Double] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var precision: js.UndefOr[Boolean] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var round: js.UndefOr[JQueryRatyRoundingOptions] = js.native
  
  var score: js.UndefOr[Double] = js.native
  
  var scoreName: js.UndefOr[String] = js.native
  
  var single: js.UndefOr[Boolean] = js.native
  
  var space: js.UndefOr[Boolean] = js.native
  
  var starHalf: js.UndefOr[String] = js.native
  
  var starOff: js.UndefOr[String] = js.native
  
  var starOn: js.UndefOr[String] = js.native
  
  var starType: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var targetFormat: js.UndefOr[String] = js.native
  
  var targetKeep: js.UndefOr[Boolean] = js.native
  
  var targetScore: js.UndefOr[String] = js.native
  
  var targetText: js.UndefOr[String] = js.native
  
  var targetType: js.UndefOr[String] = js.native
}
object JQueryRatyOptions {
  
  @scala.inline
  def apply(): JQueryRatyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryRatyOptions]
  }
  
  @scala.inline
  implicit class JQueryRatyOptionsOps[Self <: JQueryRatyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCancelClass(value: String): Self = this.set("cancelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelClass: Self = this.set("cancelClass", js.undefined)
    
    @scala.inline
    def setCancelHint(value: String): Self = this.set("cancelHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelHint: Self = this.set("cancelHint", js.undefined)
    
    @scala.inline
    def setCancelOff(value: String): Self = this.set("cancelOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelOff: Self = this.set("cancelOff", js.undefined)
    
    @scala.inline
    def setCancelOn(value: String): Self = this.set("cancelOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelOn: Self = this.set("cancelOn", js.undefined)
    
    @scala.inline
    def setCancelPlace(value: String): Self = this.set("cancelPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelPlace: Self = this.set("cancelPlace", js.undefined)
    
    @scala.inline
    def setClick(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = this.set("click", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setHalf(value: Boolean): Self = this.set("half", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalf: Self = this.set("half", js.undefined)
    
    @scala.inline
    def setHalfShow(value: Boolean): Self = this.set("halfShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalfShow: Self = this.set("halfShow", js.undefined)
    
    @scala.inline
    def setHintsVarargs(value: String*): Self = this.set("hints", js.Array(value :_*))
    
    @scala.inline
    def setHints(value: js.Array[String]): Self = this.set("hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    
    @scala.inline
    def setIconRangeVarargs(value: js.Array[js.Any]*): Self = this.set("iconRange", js.Array(value :_*))
    
    @scala.inline
    def setIconRange(value: js.Array[js.Array[_]]): Self = this.set("iconRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconRange: Self = this.set("iconRange", js.undefined)
    
    @scala.inline
    def setMouseout(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = this.set("mouseout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: (/* score */ Double, /* event */ JQueryEventObject) => Unit): Self = this.set("mouseover", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    
    @scala.inline
    def setNoRatedMsg(value: String): Self = this.set("noRatedMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRatedMsg: Self = this.set("noRatedMsg", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setNumberMax(value: Double): Self = this.set("numberMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberMax: Self = this.set("numberMax", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPrecision(value: Boolean): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRound(value: JQueryRatyRoundingOptions): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setScoreName(value: String): Self = this.set("scoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreName: Self = this.set("scoreName", js.undefined)
    
    @scala.inline
    def setSingle(value: Boolean): Self = this.set("single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingle: Self = this.set("single", js.undefined)
    
    @scala.inline
    def setSpace(value: Boolean): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setStarHalf(value: String): Self = this.set("starHalf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarHalf: Self = this.set("starHalf", js.undefined)
    
    @scala.inline
    def setStarOff(value: String): Self = this.set("starOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarOff: Self = this.set("starOff", js.undefined)
    
    @scala.inline
    def setStarOn(value: String): Self = this.set("starOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarOn: Self = this.set("starOn", js.undefined)
    
    @scala.inline
    def setStarType(value: String): Self = this.set("starType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarType: Self = this.set("starType", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetFormat(value: String): Self = this.set("targetFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetFormat: Self = this.set("targetFormat", js.undefined)
    
    @scala.inline
    def setTargetKeep(value: Boolean): Self = this.set("targetKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetKeep: Self = this.set("targetKeep", js.undefined)
    
    @scala.inline
    def setTargetScore(value: String): Self = this.set("targetScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetScore: Self = this.set("targetScore", js.undefined)
    
    @scala.inline
    def setTargetText(value: String): Self = this.set("targetText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetText: Self = this.set("targetText", js.undefined)
    
    @scala.inline
    def setTargetType(value: String): Self = this.set("targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetType: Self = this.set("targetType", js.undefined)
  }
}
