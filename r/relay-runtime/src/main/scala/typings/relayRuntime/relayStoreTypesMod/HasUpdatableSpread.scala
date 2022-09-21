package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasUpdatableSpread[TFragmentType] extends StObject {
  
  @JSName("$updatableFragmentSpreads")
  val $updatableFragmentSpreads: TFragmentType
}
object HasUpdatableSpread {
  
  inline def apply[TFragmentType]($updatableFragmentSpreads: TFragmentType): HasUpdatableSpread[TFragmentType] = {
    val __obj = js.Dynamic.literal($updatableFragmentSpreads = $updatableFragmentSpreads.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasUpdatableSpread[TFragmentType]]
  }
  
  extension [Self <: HasUpdatableSpread[?], TFragmentType](x: Self & HasUpdatableSpread[TFragmentType]) {
    
    inline def set$updatableFragmentSpreads(value: TFragmentType): Self = StObject.set(x, "$updatableFragmentSpreads", value.asInstanceOf[js.Any])
  }
}
