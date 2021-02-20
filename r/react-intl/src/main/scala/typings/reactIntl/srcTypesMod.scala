package typings.reactIntl

import typings.formatjsIntl.srcTypesMod.Formatters
import typings.formatjsIntl.srcTypesMod.IntlFormatters
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  @js.native
  trait IntlConfig
    extends typings.formatjsIntl.srcTypesMod.IntlConfig[ReactNode] {
    
    var textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
      ] = js.native
    
    var wrapRichTextChunksInFragment: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait IntlShape
    extends IntlConfig
       with IntlFormatters[ReactNode, ReactNode] {
    
    var formatters: Formatters = js.native
  }
}
