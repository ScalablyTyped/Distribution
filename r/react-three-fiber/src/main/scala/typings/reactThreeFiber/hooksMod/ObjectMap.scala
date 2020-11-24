package typings.reactThreeFiber.hooksMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.mod.Material
import typings.three.mod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectMap extends js.Object {
  
  var materials: StringDictionary[Material] = js.native
  
  var nodes: StringDictionary[Object3D] = js.native
}
object ObjectMap {
  
  @scala.inline
  def apply(materials: StringDictionary[Material], nodes: StringDictionary[Object3D]): ObjectMap = {
    val __obj = js.Dynamic.literal(materials = materials.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMap]
  }
  
  @scala.inline
  implicit class ObjectMapOps[Self <: ObjectMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaterials(value: StringDictionary[Material]): Self = this.set("materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: StringDictionary[Object3D]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
}
