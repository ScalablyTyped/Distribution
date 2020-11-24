package typings.pulumiAws.inputMod.apigatewayv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiCorsConfiguration extends js.Object {
  
  /**
    * Whether credentials are included in the CORS request.
    */
  var allowCredentials: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The set of allowed HTTP headers.
    */
  var allowHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The set of allowed HTTP methods.
    */
  var allowMethods: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The set of allowed origins.
    */
  var allowOrigins: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The set of exposed HTTP headers.
    */
  var exposeHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The number of seconds that the browser should cache preflight request results.
    */
  var maxAge: js.UndefOr[Input[Double]] = js.native
}
object ApiCorsConfiguration {
  
  @scala.inline
  def apply(): ApiCorsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiCorsConfiguration]
  }
  
  @scala.inline
  implicit class ApiCorsConfigurationOps[Self <: ApiCorsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAllowCredentials(value: Input[Boolean]): Self = this.set("allowCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCredentials: Self = this.set("allowCredentials", js.undefined)
    
    @scala.inline
    def setAllowHeadersVarargs(value: Input[String]*): Self = this.set("allowHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowHeaders(value: Input[js.Array[Input[String]]]): Self = this.set("allowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHeaders: Self = this.set("allowHeaders", js.undefined)
    
    @scala.inline
    def setAllowMethodsVarargs(value: Input[String]*): Self = this.set("allowMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowMethods(value: Input[js.Array[Input[String]]]): Self = this.set("allowMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMethods: Self = this.set("allowMethods", js.undefined)
    
    @scala.inline
    def setAllowOriginsVarargs(value: Input[String]*): Self = this.set("allowOrigins", js.Array(value :_*))
    
    @scala.inline
    def setAllowOrigins(value: Input[js.Array[Input[String]]]): Self = this.set("allowOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOrigins: Self = this.set("allowOrigins", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: Input[String]*): Self = this.set("exposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: Input[js.Array[Input[String]]]): Self = this.set("exposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposeHeaders: Self = this.set("exposeHeaders", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Input[Double]): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
  }
}
