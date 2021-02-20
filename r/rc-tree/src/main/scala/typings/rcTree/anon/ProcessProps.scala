package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessProps extends StObject {
  
  def processProps(prop: DataNode): js.Any = js.native
}
object ProcessProps {
  
  @scala.inline
  def apply(processProps: DataNode => js.Any): ProcessProps = {
    val __obj = js.Dynamic.literal(processProps = js.Any.fromFunction1(processProps))
    __obj.asInstanceOf[ProcessProps]
  }
  
  @scala.inline
  implicit class ProcessPropsMutableBuilder[Self <: ProcessProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessProps(value: DataNode => js.Any): Self = StObject.set(x, "processProps", js.Any.fromFunction1(value))
  }
}
