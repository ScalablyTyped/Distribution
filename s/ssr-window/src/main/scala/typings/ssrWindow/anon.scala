package typings.ssrWindow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveElement extends StObject {
    
    var activeElement: Blur
    
    def addEventListener(): Unit
    
    def createElement(): ChildNodes
    
    def createElementNS(): js.Object
    
    def createEvent(): InitEvent
    
    def getElementById(): Any
    
    def importNode(): Any
    
    var location: Hash
    
    def querySelector(): Any
    
    def querySelectorAll(): js.Array[Any]
    
    def removeEventListener(): Unit
  }
  object ActiveElement {
    
    inline def apply(
      activeElement: Blur,
      addEventListener: () => Unit,
      createElement: () => ChildNodes,
      createElementNS: () => js.Object,
      createEvent: () => InitEvent,
      getElementById: () => Any,
      importNode: () => Any,
      location: Hash,
      querySelector: () => Any,
      querySelectorAll: () => js.Array[Any],
      removeEventListener: () => Unit
    ): ActiveElement = {
      val __obj = js.Dynamic.literal(activeElement = activeElement.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction0(addEventListener), createElement = js.Any.fromFunction0(createElement), createElementNS = js.Any.fromFunction0(createElementNS), createEvent = js.Any.fromFunction0(createEvent), getElementById = js.Any.fromFunction0(getElementById), importNode = js.Any.fromFunction0(importNode), location = location.asInstanceOf[js.Any], querySelector = js.Any.fromFunction0(querySelector), querySelectorAll = js.Any.fromFunction0(querySelectorAll), removeEventListener = js.Any.fromFunction0(removeEventListener))
      __obj.asInstanceOf[ActiveElement]
    }
    
    extension [Self <: ActiveElement](x: Self) {
      
      inline def setActiveElement(value: Blur): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
      
      inline def setAddEventListener(value: () => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction0(value))
      
      inline def setCreateElement(value: () => ChildNodes): Self = StObject.set(x, "createElement", js.Any.fromFunction0(value))
      
      inline def setCreateElementNS(value: () => js.Object): Self = StObject.set(x, "createElementNS", js.Any.fromFunction0(value))
      
      inline def setCreateEvent(value: () => InitEvent): Self = StObject.set(x, "createEvent", js.Any.fromFunction0(value))
      
      inline def setGetElementById(value: () => Any): Self = StObject.set(x, "getElementById", js.Any.fromFunction0(value))
      
      inline def setImportNode(value: () => Any): Self = StObject.set(x, "importNode", js.Any.fromFunction0(value))
      
      inline def setLocation(value: Hash): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setQuerySelector(value: () => Any): Self = StObject.set(x, "querySelector", js.Any.fromFunction0(value))
      
      inline def setQuerySelectorAll(value: () => js.Array[Any]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction0(value))
      
      inline def setRemoveEventListener(value: () => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction0(value))
    }
  }
  
  trait Back extends StObject {
    
    def back(): Unit
    
    def go(): Unit
    
    def pushState(): Unit
    
    def replaceState(): Unit
  }
  object Back {
    
    inline def apply(back: () => Unit, go: () => Unit, pushState: () => Unit, replaceState: () => Unit): Back = {
      val __obj = js.Dynamic.literal(back = js.Any.fromFunction0(back), go = js.Any.fromFunction0(go), pushState = js.Any.fromFunction0(pushState), replaceState = js.Any.fromFunction0(replaceState))
      __obj.asInstanceOf[Back]
    }
    
    extension [Self <: Back](x: Self) {
      
      inline def setBack(value: () => Unit): Self = StObject.set(x, "back", js.Any.fromFunction0(value))
      
      inline def setGo(value: () => Unit): Self = StObject.set(x, "go", js.Any.fromFunction0(value))
      
      inline def setPushState(value: () => Unit): Self = StObject.set(x, "pushState", js.Any.fromFunction0(value))
      
      inline def setReplaceState(value: () => Unit): Self = StObject.set(x, "replaceState", js.Any.fromFunction0(value))
    }
  }
  
  trait Blur extends StObject {
    
    def blur(): Unit
    
    var nodeName: String
  }
  object Blur {
    
    inline def apply(blur: () => Unit, nodeName: String): Blur = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), nodeName = nodeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blur]
    }
    
    extension [Self <: Blur](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChildNodes extends StObject {
    
    var childNodes: js.Array[Any]
    
    var children: js.Array[Any]
    
    def getElementsByTagName(): js.Array[Any]
    
    def setAttribute(): Unit
  }
  object ChildNodes {
    
    inline def apply(
      childNodes: js.Array[Any],
      children: js.Array[Any],
      getElementsByTagName: () => js.Array[Any],
      setAttribute: () => Unit
    ): ChildNodes = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], getElementsByTagName = js.Any.fromFunction0(getElementsByTagName), setAttribute = js.Any.fromFunction0(setAttribute))
      __obj.asInstanceOf[ChildNodes]
    }
    
    extension [Self <: ChildNodes](x: Self) {
      
      inline def setChildNodes(value: js.Array[Any]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: Any*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setGetElementsByTagName(value: () => js.Array[Any]): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction0(value))
      
      inline def setSetAttribute(value: () => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction0(value))
    }
  }
  
  trait GetPropertyValue extends StObject {
    
    def getPropertyValue(): String
  }
  object GetPropertyValue {
    
    inline def apply(getPropertyValue: () => String): GetPropertyValue = {
      val __obj = js.Dynamic.literal(getPropertyValue = js.Any.fromFunction0(getPropertyValue))
      __obj.asInstanceOf[GetPropertyValue]
    }
    
    extension [Self <: GetPropertyValue](x: Self) {
      
      inline def setGetPropertyValue(value: () => String): Self = StObject.set(x, "getPropertyValue", js.Any.fromFunction0(value))
    }
  }
  
  trait Hash extends StObject {
    
    var hash: String
    
    var host: String
    
    var hostname: String
    
    var href: String
    
    var origin: String
    
    var pathname: String
    
    var protocol: String
    
    var search: String
  }
  object Hash {
    
    inline def apply(
      hash: String,
      host: String,
      hostname: String,
      href: String,
      origin: String,
      pathname: String,
      protocol: String,
      search: String
    ): Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitEvent extends StObject {
    
    def initEvent(): Unit
  }
  object InitEvent {
    
    inline def apply(initEvent: () => Unit): InitEvent = {
      val __obj = js.Dynamic.literal(initEvent = js.Any.fromFunction0(initEvent))
      __obj.asInstanceOf[InitEvent]
    }
    
    extension [Self <: InitEvent](x: Self) {
      
      inline def setInitEvent(value: () => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction0(value))
    }
  }
  
  trait UserAgent extends StObject {
    
    var userAgent: String
  }
  object UserAgent {
    
    inline def apply(userAgent: String): UserAgent = {
      val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgent]
    }
    
    extension [Self <: UserAgent](x: Self) {
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
}
