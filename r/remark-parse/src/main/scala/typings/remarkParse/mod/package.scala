package typings.remarkParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Parse = typings.unified.mod.Plugin[
    js.Array[js.UndefOr[typings.remarkParse.mod.RemarkParseOptions]], 
    typings.unified.mod.Settings
  ]
  
  type RemarkParseOptions = typings.mdastUtilFromMarkdown.mod.Options
}
