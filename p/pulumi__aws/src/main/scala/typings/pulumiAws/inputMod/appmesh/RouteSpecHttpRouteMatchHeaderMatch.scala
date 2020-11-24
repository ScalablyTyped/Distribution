package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRouteMatchHeaderMatch extends js.Object {
  
  /**
    * The value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
    */
  var exact: js.UndefOr[Input[String]] = js.native
  
  /**
    * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The object that specifies the range of numbers that the value sent by the client must be included in.
    */
  var range: js.UndefOr[Input[RouteSpecHttpRouteMatchHeaderMatchRange]] = js.native
  
  /**
    * The value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
    */
  var regex: js.UndefOr[Input[String]] = js.native
  
  /**
    * The value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
    */
  var suffix: js.UndefOr[Input[String]] = js.native
}
object RouteSpecHttpRouteMatchHeaderMatch {
  
  @scala.inline
  def apply(): RouteSpecHttpRouteMatchHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeaderMatch]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteMatchHeaderMatchOps[Self <: RouteSpecHttpRouteMatchHeaderMatch] (val x: Self) extends AnyVal {
    
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
    def setExact(value: Input[String]): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRange(value: Input[RouteSpecHttpRouteMatchHeaderMatchRange]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRegex(value: Input[String]): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setSuffix(value: Input[String]): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
}
