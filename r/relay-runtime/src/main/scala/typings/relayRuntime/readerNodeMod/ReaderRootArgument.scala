package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderRootArgument
  extends StObject
     with ReaderArgumentDefinition {
  
  val kind: String
  
  // 'RootArgument';
  val name: String
}
object ReaderRootArgument {
  
  @scala.inline
  def apply(kind: String, name: String): ReaderRootArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRootArgument]
  }
  
  @scala.inline
  implicit class ReaderRootArgumentMutableBuilder[Self <: ReaderRootArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
