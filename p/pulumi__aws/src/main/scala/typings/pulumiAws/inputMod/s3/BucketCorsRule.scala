package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketCorsRule extends js.Object {
  
  /**
    * Specifies which headers are allowed.
    */
  var allowedHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
    */
  var allowedMethods: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Specifies which origins are allowed.
    */
  var allowedOrigins: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Specifies expose header in the response.
    */
  var exposeHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Specifies time in seconds that browser can cache the response for a preflight request.
    */
  var maxAgeSeconds: js.UndefOr[Input[Double]] = js.native
}
object BucketCorsRule {
  
  @scala.inline
  def apply(allowedMethods: Input[js.Array[Input[String]]], allowedOrigins: Input[js.Array[Input[String]]]): BucketCorsRule = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCorsRule]
  }
  
  @scala.inline
  implicit class BucketCorsRuleOps[Self <: BucketCorsRule] (val x: Self) extends AnyVal {
    
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
    def setAllowedMethodsVarargs(value: Input[String]*): Self = this.set("allowedMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowedMethods(value: Input[js.Array[Input[String]]]): Self = this.set("allowedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOriginsVarargs(value: Input[String]*): Self = this.set("allowedOrigins", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOrigins(value: Input[js.Array[Input[String]]]): Self = this.set("allowedOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHeadersVarargs(value: Input[String]*): Self = this.set("allowedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHeaders(value: Input[js.Array[Input[String]]]): Self = this.set("allowedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedHeaders: Self = this.set("allowedHeaders", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: Input[String]*): Self = this.set("exposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: Input[js.Array[Input[String]]]): Self = this.set("exposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposeHeaders: Self = this.set("exposeHeaders", js.undefined)
    
    @scala.inline
    def setMaxAgeSeconds(value: Input[Double]): Self = this.set("maxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAgeSeconds: Self = this.set("maxAgeSeconds", js.undefined)
  }
}
