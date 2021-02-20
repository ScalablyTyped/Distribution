package typings.rollup.mod

import typings.rollup.rollupBooleans.`true`
import typings.rollup.rollupStrings.asset
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputAsset extends PreRenderedAsset {
  
  var fileName: String = js.native
  
  /** @deprecated Accessing "isAsset" on files in the bundle is deprecated, please use "type === \'asset\'" instead */
  var isAsset: `true` = js.native
}
object OutputAsset {
  
  @scala.inline
  def apply(fileName: String, isAsset: `true`, source: String | Uint8Array, `type`: asset): OutputAsset = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isAsset = isAsset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputAsset]
  }
  
  @scala.inline
  implicit class OutputAssetMutableBuilder[Self <: OutputAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAsset(value: `true`): Self = StObject.set(x, "isAsset", value.asInstanceOf[js.Any])
  }
}
