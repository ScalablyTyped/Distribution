package typings.scrollBehavior

import typings.scrollBehavior.mod.LocationBase
import typings.scrollBehavior.mod.ScrollPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Read[TLocation /* <: LocationBase */] extends StObject {
    
    def read(location: TLocation): js.UndefOr[ScrollPosition | Null] = js.native
    def read(location: TLocation, key: String): js.UndefOr[ScrollPosition | Null] = js.native
    
    def save(location: TLocation, key: String, value: ScrollPosition): Unit = js.native
    def save(location: TLocation, key: Null, value: ScrollPosition): Unit = js.native
  }
}
