package typings.reactMdTypography

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object textMod {
  
  type TextElement = typings.std.HTMLHeadingElement | typings.std.HTMLParagraphElement | typings.std.HTMLSpanElement | typings.std.HTMLDivElement | typings.std.HTMLButtonElement | typings.std.HTMLAnchorElement | typings.std.HTMLBodyElement | typings.std.HTMLHtmlElement
  
  type TextRenderFunction = js.Function1[
    /* props */ typings.reactMdTypography.anon.ClassName, 
    typings.react.mod.ReactElement
  ]
}
