package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.screepsStrings.constructedWall
import typings.screeps.screepsStrings.controller
import typings.screeps.screepsStrings.creep
import typings.screeps.screepsStrings.deposit
import typings.screeps.screepsStrings.extension
import typings.screeps.screepsStrings.factory
import typings.screeps.screepsStrings.invaderCore
import typings.screeps.screepsStrings.lab
import typings.screeps.screepsStrings.link
import typings.screeps.screepsStrings.mineral
import typings.screeps.screepsStrings.nuker
import typings.screeps.screepsStrings.observer
import typings.screeps.screepsStrings.powerBank
import typings.screeps.screepsStrings.powerCreep
import typings.screeps.screepsStrings.powerSpawn
import typings.screeps.screepsStrings.source
import typings.screeps.screepsStrings.spawn
import typings.screeps.screepsStrings.storage
import typings.screeps.screepsStrings.terminal
import typings.screeps.screepsStrings.tower
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OBSTACLE_OBJECT_TYPES")
@js.native
object OBSTACLE_OBJECT_TYPES
  extends TopLevel[
      js.Tuple20[
        spawn, 
        creep, 
        powerCreep, 
        source, 
        mineral, 
        deposit, 
        controller, 
        constructedWall, 
        extension, 
        link, 
        storage, 
        tower, 
        observer, 
        powerSpawn, 
        powerBank, 
        lab, 
        terminal, 
        nuker, 
        factory, 
        invaderCore
      ]
    ]

