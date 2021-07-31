package typings.pulumiCloud

import typings.pulumiCloud.serviceMod.ContainerProtocol
import typings.pulumiCloud.serviceMod.HostOperatingSystem
import typings.pulumiCloud.serviceMod.VolumeKind
import typings.pulumiCloud.tableMod.PrimaryKeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pulumiCloudStrings {
  
  @js.native
  sealed trait HostPathVolume
    extends StObject
       with VolumeKind
  @scala.inline
  def HostPathVolume: HostPathVolume = "HostPathVolume".asInstanceOf[HostPathVolume]
  
  @js.native
  sealed trait SharedVolume
    extends StObject
       with VolumeKind
  @scala.inline
  def SharedVolume: SharedVolume = "SharedVolume".asInstanceOf[SharedVolume]
  
  @js.native
  sealed trait boolean
    extends StObject
       with PrimaryKeyType
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait http
    extends StObject
       with ContainerProtocol
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https
    extends StObject
       with ContainerProtocol
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait linux
    extends StObject
       with HostOperatingSystem
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  
  @js.native
  sealed trait number
    extends StObject
       with PrimaryKeyType
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait string
    extends StObject
       with PrimaryKeyType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait tcp
    extends StObject
       with ContainerProtocol
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @js.native
  sealed trait udp
    extends StObject
       with ContainerProtocol
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  
  @js.native
  sealed trait windows
    extends StObject
       with HostOperatingSystem
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}
