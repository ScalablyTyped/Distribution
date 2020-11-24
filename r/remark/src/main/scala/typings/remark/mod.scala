package typings.remark

import org.scalablytyped.runtime.TopLevel
import typings.remarkParse.mod.RemarkParseOptions
import typings.remarkStringify.mod.RemarkStringifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("remark", JSImport.Namespace)
@js.native
object mod
  extends TopLevel[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify unified.FrozenProcessor<RemarkOptions> */ js.Any
    ] {
  
  /**
    * @deprecated Use `RemarkOptions` instead.
    */
  type PartialRemarkOptions = RemarkOptions
  
  type RemarkOptions = RemarkParseOptions with RemarkStringifyOptions
}
