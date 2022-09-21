package typings.recoil.mod

import typings.recoil.anon.Reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadWriteSelectorOptions[T]
  extends StObject
     with ReadOnlySelectorOptions[T] {
  
  def set(opts: Reset, newValue: T): Unit = js.native
  def set(opts: Reset, newValue: DefaultValue): Unit = js.native
}
