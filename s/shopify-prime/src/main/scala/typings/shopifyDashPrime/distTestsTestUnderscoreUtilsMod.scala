package typings.shopifyDashPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/tests/test_utils", JSImport.Namespace)
@js.native
object distTestsTestUnderscoreUtilsMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Matcher * / any */ @js.native
  class MatcherExtension protected () extends js.Object {
    def this(value: js.Any) = this()
    val not: MatcherExtension = js.native
    def itemsToPassValidator[T](validator: js.Function1[/* item */ T, Unit]): Unit = js.native
    def toBeAnArray(): Unit = js.native
    def toBeGreaterThanOrEqualTo(value: Double): Unit = js.native
    def toBeLesserThanOrEqualTo(value: Double): Unit = js.native
    def toBeNullOrUndefined(): Unit = js.native
    def toBeType(expectedType: String): Unit = js.native
  }
  
  def Expect(value: js.Any): MatcherExtension = js.native
  def createGuid(): String = js.native
  @js.native
  object Config extends js.Object {
    var accessToken: String = js.native
    var apiKey: String = js.native
    var secretKey: String = js.native
    var shopDomain: String = js.native
  }
  
}

