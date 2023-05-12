package typings.staticmaps

import typings.staticmaps.mod.ResizeMode
import typings.staticmaps.mod.TextAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticmapsStrings {
  
  @js.native
  sealed trait contain
    extends StObject
       with ResizeMode
  inline def contain: contain = "contain".asInstanceOf[contain]
  
  @js.native
  sealed trait cover
    extends StObject
       with ResizeMode
  inline def cover: cover = "cover".asInstanceOf[cover]
  
  @js.native
  sealed trait end
    extends StObject
       with TextAnchor
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait fill
    extends StObject
       with ResizeMode
  inline def fill: fill = "fill".asInstanceOf[fill]
  
  @js.native
  sealed trait inside
    extends StObject
       with ResizeMode
  inline def inside: inside = "inside".asInstanceOf[inside]
  
  @js.native
  sealed trait middle
    extends StObject
       with TextAnchor
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait outside
    extends StObject
       with ResizeMode
  inline def outside: outside = "outside".asInstanceOf[outside]
  
  @js.native
  sealed trait start
    extends StObject
       with TextAnchor
  inline def start: start = "start".asInstanceOf[start]
}
