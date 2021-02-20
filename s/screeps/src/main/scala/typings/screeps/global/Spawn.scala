package typings.screeps.global

import org.scalablytyped.runtime.Shortcut
import typings.screeps.Id
import typings.screeps.StructureSpawnConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Spawn")
@js.native
class Spawn protected ()
  extends typings.screeps.StructureSpawn {
  def this(id: Id[typings.screeps.StructureSpawn]) = this()
}
object Spawn extends Shortcut {
  
  @JSGlobal("Spawn")
  @js.native
  val ^ : StructureSpawnConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Spawn.Spawning")
  @js.native
  class Spawning protected ()
    extends typings.screeps.Spawning {
    def this(id: Id[typings.screeps.Spawning]) = this()
  }
  
  type _To = StructureSpawnConstructor
  
  /* This means you don't have to write `^`, but can instead just say `Spawn.foo` */
  override def _to: StructureSpawnConstructor = ^
}
