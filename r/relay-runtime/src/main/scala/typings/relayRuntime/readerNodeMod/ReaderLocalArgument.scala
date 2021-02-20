package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaderLocalArgument extends ReaderArgumentDefinition {
  
  val defaultValue: js.Any = js.native
  
  val kind: String = js.native
  
  // 'LocalArgument';
  val name: String = js.native
}
object ReaderLocalArgument {
  
  @scala.inline
  def apply(defaultValue: js.Any, kind: String, name: String): ReaderLocalArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderLocalArgument]
  }
  
  @scala.inline
  implicit class ReaderLocalArgumentMutableBuilder[Self <: ReaderLocalArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
