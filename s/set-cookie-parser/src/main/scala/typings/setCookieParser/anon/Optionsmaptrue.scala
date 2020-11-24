package typings.setCookieParser.anon

import typings.setCookieParser.setCookieParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined set-cookie-parser.set-cookie-parser.Options & {  map :true} */
@js.native
trait Optionsmaptrue extends js.Object {
  
  /**
    * Calls dcodeURIComponent on each value
    * @default true
    */
  var decodeValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Return an object instead of an array
    * @default false
    */
  var map: js.UndefOr[Boolean] with `true` = js.native
  
  /**
    * Suppress the warning that is loged when called on a request instead of a response
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
}
object Optionsmaptrue {
  
  @scala.inline
  def apply(map: js.UndefOr[Boolean] with `true`): Optionsmaptrue = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsmaptrue]
  }
  
  @scala.inline
  implicit class OptionsmaptrueOps[Self <: Optionsmaptrue] (val x: Self) extends AnyVal {
    
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
    def setMap(value: js.UndefOr[Boolean] with `true`): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeValues(value: Boolean): Self = this.set("decodeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeValues: Self = this.set("decodeValues", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
