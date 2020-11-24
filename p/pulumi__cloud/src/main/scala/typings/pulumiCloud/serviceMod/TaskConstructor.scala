package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskConstructor
  extends /**
  * Construct a new Task, which is a Container that can be run many times as individual tasks.
  *
  * @param name The unique name of the task.
  * @param container The container specification.
  * @param opts A bag of options that controls how this resource behaves.
  */
Instantiable2[/* name */ String, /* container */ Container, Task]
     with Instantiable3[/* name */ String, /* container */ Container, /* opts */ ResourceOptions, Task]
