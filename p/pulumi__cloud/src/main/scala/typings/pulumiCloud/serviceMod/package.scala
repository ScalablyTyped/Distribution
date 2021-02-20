package typings.pulumiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serviceMod {
  
  type Containers = org.scalablytyped.runtime.StringDictionary[typings.pulumiCloud.serviceMod.Container]
  
  type Endpoints = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.NumberDictionary[typings.pulumiCloud.serviceMod.Endpoint]
  ]
  
  @scala.inline
  def Service: typings.pulumiCloud.serviceMod.ServiceConstructor = typings.pulumiCloud.serviceMod.^.asInstanceOf[js.Dynamic].selectDynamic("Service").asInstanceOf[typings.pulumiCloud.serviceMod.ServiceConstructor]
  @scala.inline
  def Service_=(x: typings.pulumiCloud.serviceMod.ServiceConstructor): scala.Unit = typings.pulumiCloud.serviceMod.^.asInstanceOf[js.Dynamic].updateDynamic("Service")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Task: typings.pulumiCloud.serviceMod.TaskConstructor = typings.pulumiCloud.serviceMod.^.asInstanceOf[js.Dynamic].selectDynamic("Task").asInstanceOf[typings.pulumiCloud.serviceMod.TaskConstructor]
  @scala.inline
  def Task_=(x: typings.pulumiCloud.serviceMod.TaskConstructor): scala.Unit = typings.pulumiCloud.serviceMod.^.asInstanceOf[js.Dynamic].updateDynamic("Task")(x.asInstanceOf[js.Any])
}
