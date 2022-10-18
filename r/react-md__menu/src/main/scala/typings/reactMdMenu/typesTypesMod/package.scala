package typings.reactMdMenu.typesTypesMod

import typings.reactMdMenu.anon.RequiredFixedPositioningT
import typings.reactMdMenu.anon.RequiredPickMenuPropsidst
import typings.reactMdMenu.reactMdMenuStrings.`aria-label`
import typings.reactMdMenu.reactMdMenuStrings.`aria-labelledby`
import typings.reactMdMenu.reactMdMenuStrings.phone
import typings.reactMdUtils.typesTypesMod.LabelA11y
import typings.reactMdUtils.typesTypesMod.RequireAtLeastOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ProvidedMenuProps = RequiredPickMenuPropsidst & RequiredFixedPositioningT & (RequireAtLeastOne[
LabelA11y, 
/* keyof @react-md/utils.@react-md/utils/types/types.LabelA11y */ `aria-label` | `aria-labelledby`])

type RenderMenuAsSheet = Boolean | phone
