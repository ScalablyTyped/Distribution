package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizationLinkedHandle extends NormalizationHandle {
  
  // 'LinkedHandle';
  val alias: js.UndefOr[String | Null] = js.native
  
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.native
  
  val filters: js.UndefOr[js.Array[String] | Null] = js.native
  
  val handle: String = js.native
  
  val key: String = js.native
  
  val kind: String = js.native
  
  val name: String = js.native
}
object NormalizationLinkedHandle {
  
  @scala.inline
  def apply(handle: String, key: String, kind: String, name: String): NormalizationLinkedHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationLinkedHandle]
  }
  
  @scala.inline
  implicit class NormalizationLinkedHandleMutableBuilder[Self <: NormalizationLinkedHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNull: Self = StObject.set(x, "alias", null)
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsNull: Self = StObject.set(x, "args", null)
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersNull: Self = StObject.set(x, "filters", null)
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
