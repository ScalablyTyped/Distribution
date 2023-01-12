package typings.rcTree.anon

import typings.rcTree.esInterfaceMod.DataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessProps extends StObject {
  
  def processProps(prop: DataNode): Any
}
object ProcessProps {
  
  inline def apply(processProps: DataNode => Any): ProcessProps = {
    val __obj = js.Dynamic.literal(processProps = js.Any.fromFunction1(processProps))
    __obj.asInstanceOf[ProcessProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessProps] (val x: Self) extends AnyVal {
    
    inline def setProcessProps(value: DataNode => Any): Self = StObject.set(x, "processProps", js.Any.fromFunction1(value))
  }
}
