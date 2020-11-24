package typings.revalidate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Comparer = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  
  type ComposeConfig = typings.revalidate.mod.Config with typings.revalidate.mod.Multiple
  
  type ComposedCurryableValidator = js.Function1[
    /* config */ js.UndefOr[java.lang.String | typings.revalidate.mod.ComposeConfig], 
    typings.revalidate.mod.ConfiguredValidator
  ]
  
  type ConfigurableValidator = typings.revalidate.mod.UnconfiguredValidator with typings.revalidate.mod.CurryableValidator
  
  type ConfiguredCombinedValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  
  type ConfiguredValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  
  type CurryableValidator = js.Function1[
    /* config */ js.UndefOr[java.lang.String | typings.revalidate.mod.Config], 
    typings.revalidate.mod.ConfiguredValidator
  ]
  
  type MessageCreator = (js.Function1[/* field */ js.Any, js.Any]) | java.lang.String
  
  type UnconfiguredValidator = js.Function3[
    /* config */ js.UndefOr[java.lang.String | typings.revalidate.mod.Config], 
    /* value */ js.UndefOr[js.Any], 
    /* allValues */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  type Validator = typings.revalidate.mod.ConfiguredValidator with typings.revalidate.mod.UnconfiguredValidator
  
  type ValidatorImpl = js.Function1[
    /* message */ js.Any, 
    js.Function2[/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], js.Any]
  ]
}
