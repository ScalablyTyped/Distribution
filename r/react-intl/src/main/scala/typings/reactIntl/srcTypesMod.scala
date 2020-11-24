package typings.reactIntl

import typings.formatjsIntl.srcTypesMod.Formatters
import typings.formatjsIntl.srcTypesMod.IntlFormatters
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-intl/src/types", JSImport.Namespace)
@js.native
object srcTypesMod extends js.Object {
  
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
