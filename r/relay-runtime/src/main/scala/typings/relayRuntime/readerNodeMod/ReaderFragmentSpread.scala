package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderFragmentSpread
  extends StObject
     with ReaderSelection {
  
  val args: js.UndefOr[js.Array[ReaderArgument] | Null] = js.undefined
  
  val kind: String
  
  // 'FragmentSpread';
  val name: String
}
object ReaderFragmentSpread {
  
  @scala.inline
  def apply(kind: String, name: String): ReaderFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderFragmentSpread]
  }
  
  @scala.inline
  implicit class ReaderFragmentSpreadMutableBuilder[Self <: ReaderFragmentSpread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[ReaderArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsNull: Self = StObject.set(x, "args", null)
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: ReaderArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
