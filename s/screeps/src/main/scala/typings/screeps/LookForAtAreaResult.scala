package typings.screeps

import typings.screeps.screepsStrings.constructionSite
import typings.screeps.screepsStrings.creep
import typings.screeps.screepsStrings.deposit
import typings.screeps.screepsStrings.energy
import typings.screeps.screepsStrings.exit
import typings.screeps.screepsStrings.flag
import typings.screeps.screepsStrings.mineral
import typings.screeps.screepsStrings.nuke
import typings.screeps.screepsStrings.powerCreep
import typings.screeps.screepsStrings.resource
import typings.screeps.screepsStrings.ruin
import typings.screeps.screepsStrings.source
import typings.screeps.screepsStrings.structure
import typings.screeps.screepsStrings.terrain
import typings.screeps.screepsStrings.tombstone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookForAtAreaResult[T, K /* <: tombstone | exit | resource | creep | structure | source | deposit | constructionSite | mineral | nuke | flag | energy | ruin | terrain | powerCreep */] extends js.Object {
  
  var `type`: K = js.native
}
