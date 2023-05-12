package typings.reactSpringCore.mod

import org.scalablytyped.runtime.Shortcut
import typings.reactSpringCore.anon.Friction
import typings.reactSpringCore.anon.FrictionTension
import typings.reactSpringCore.anon.Tension
import typings.reactSpringCore.anon.`1`
import typings.reactSpringCore.anon.`2`
import typings.reactSpringCore.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config extends Shortcut {
  
  @JSImport("@react-spring/core", "config.default")
  @js.native
  val default: Friction = js.native
  
  @JSImport("@react-spring/core", "config.gentle")
  @js.native
  val gentle: Tension = js.native
  
  @JSImport("@react-spring/core", "config.molasses")
  @js.native
  val molasses: `3` = js.native
  
  @JSImport("@react-spring/core", "config.slow")
  @js.native
  val slow: `2` = js.native
  
  @JSImport("@react-spring/core", "config.stiff")
  @js.native
  val stiff: `1` = js.native
  
  @JSImport("@react-spring/core", "config.wobbly")
  @js.native
  val wobbly: FrictionTension = js.native
  
  type _To = Friction
  
  /* This means you don't have to write `default`, but can instead just say `config.foo` */
  override def _to: Friction = default
}
