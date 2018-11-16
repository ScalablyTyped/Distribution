package typings
package revalidateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object revalidateMod {
  type Comparer = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  type ComposeConfig = Config with Multiple
  type ComposedCurryableValidator = js.Function1[/* config */ js.UndefOr[java.lang.String | ComposeConfig], ConfiguredValidator]
  type ConfigurableValidator = UnconfiguredValidator with CurryableValidator
  type ConfiguredCombinedValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  type ConfiguredValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  type CurryableValidator = js.Function1[/* config */ js.UndefOr[java.lang.String | Config], ConfiguredValidator]
  type MessageCreator = (js.Function1[/* field */ js.Any, js.Any]) | java.lang.String
  type UnconfiguredValidator = js.Function3[
    /* config */ js.UndefOr[java.lang.String | Config], 
    /* value */ js.UndefOr[js.Any], 
    /* allValues */ js.UndefOr[js.Any], 
    js.Any
  ]
  type Validator = ConfiguredValidator with UnconfiguredValidator
  type ValidatorImpl = js.Function1[
    /* message */ js.Any, 
    js.Function2[/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], js.Any]
  ]
}
