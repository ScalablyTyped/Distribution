package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeConstraintSetSizeConstraintFieldToMatch extends StObject {
  
  /**
    * When `type` is `HEADER`, enter the name of the header that you want to search, e.g. `User-Agent` or `Referer`.
    * If `type` is any other value, omit this field.
    */
  var data: js.UndefOr[Input[String]] = js.native
  
  /**
    * The part of the web request that you want AWS WAF to search for a specified string.
    * e.g. `HEADER`, `METHOD` or `BODY`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_FieldToMatch.html)
    * for all supported values.
    */
  var `type`: Input[String] = js.native
}
object SizeConstraintSetSizeConstraintFieldToMatch {
  
  @scala.inline
  def apply(`type`: Input[String]): SizeConstraintSetSizeConstraintFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSetSizeConstraintFieldToMatch]
  }
  
  @scala.inline
  implicit class SizeConstraintSetSizeConstraintFieldToMatchMutableBuilder[Self <: SizeConstraintSetSizeConstraintFieldToMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Input[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
