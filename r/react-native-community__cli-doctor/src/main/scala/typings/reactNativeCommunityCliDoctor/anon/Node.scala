package typings.reactNativeCommunityCliDoctor.anon

import typings.reactNativeCommunityCliDoctor.typesMod.AvailableInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var Node: AvailableInformation
  
  var Watchman: AvailableInformation
  
  var Yarn: AvailableInformation
  
  var npm: AvailableInformation
}
object Node {
  
  inline def apply(
    Node: AvailableInformation,
    Watchman: AvailableInformation,
    Yarn: AvailableInformation,
    npm: AvailableInformation
  ): Node = {
    val __obj = js.Dynamic.literal(Node = Node.asInstanceOf[js.Any], Watchman = Watchman.asInstanceOf[js.Any], Yarn = Yarn.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setNode(value: AvailableInformation): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    inline def setNpm(value: AvailableInformation): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
    
    inline def setWatchman(value: AvailableInformation): Self = StObject.set(x, "Watchman", value.asInstanceOf[js.Any])
    
    inline def setYarn(value: AvailableInformation): Self = StObject.set(x, "Yarn", value.asInstanceOf[js.Any])
  }
}
