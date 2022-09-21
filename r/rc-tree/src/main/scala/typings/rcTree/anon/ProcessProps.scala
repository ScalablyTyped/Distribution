package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataNode
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
  
  extension [Self <: ProcessProps](x: Self) {
    
    inline def setProcessProps(value: DataNode => Any): Self = StObject.set(x, "processProps", js.Any.fromFunction1(value))
  }
}
