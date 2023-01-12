package typings.relayRuntime.libUtilReaderNodeMod

import typings.relayRuntime.anon.FragmentRefs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.relayRuntime.libUtilReaderNodeMod.ReaderSelection because Already inherited */ trait ReaderRelayResolver
  extends StObject
     with ReaderField {
  
  // 'RelayResolver';
  val alias: js.UndefOr[String | Null] = js.undefined
  
  val fragment: ReaderFragmentSpread
  
  val kind: String
  
  val name: String
  
  def resolverModule(rootKey: FragmentRefs): Any
}
object ReaderRelayResolver {
  
  inline def apply(fragment: ReaderFragmentSpread, kind: String, name: String, resolverModule: FragmentRefs => Any): ReaderRelayResolver = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolverModule = js.Any.fromFunction1(resolverModule))
    __obj.asInstanceOf[ReaderRelayResolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReaderRelayResolver] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setFragment(value: ReaderFragmentSpread): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResolverModule(value: FragmentRefs => Any): Self = StObject.set(x, "resolverModule", js.Any.fromFunction1(value))
  }
}
