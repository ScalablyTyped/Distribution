package typings
package atPulumiCloudLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atPulumiCloudLibStrings {
  @js.native
  sealed trait HostPathVolume
    extends atPulumiCloudLib.serviceMod.VolumeKind
  
  @js.native
  sealed trait SharedVolume
    extends atPulumiCloudLib.serviceMod.VolumeKind
  
  @js.native
  sealed trait boolean
    extends atPulumiCloudLib.tableMod.PrimaryKeyType
  
  @js.native
  sealed trait http
    extends atPulumiCloudLib.serviceMod.ContainerProtocol
  
  @js.native
  sealed trait https
    extends atPulumiCloudLib.serviceMod.ContainerProtocol
  
  @js.native
  sealed trait linux
    extends atPulumiCloudLib.serviceMod.HostOperatingSystem
  
  @js.native
  sealed trait number
    extends atPulumiCloudLib.tableMod.PrimaryKeyType
  
  @js.native
  sealed trait string
    extends atPulumiCloudLib.tableMod.PrimaryKeyType
  
  @js.native
  sealed trait tcp
    extends atPulumiCloudLib.serviceMod.ContainerProtocol
  
  @js.native
  sealed trait udp
    extends atPulumiCloudLib.serviceMod.ContainerProtocol
  
  @js.native
  sealed trait windows
    extends atPulumiCloudLib.serviceMod.HostOperatingSystem
  
  @scala.inline
  def HostPathVolume: HostPathVolume = "HostPathVolume".asInstanceOf[HostPathVolume]
  @scala.inline
  def SharedVolume: SharedVolume = "SharedVolume".asInstanceOf[SharedVolume]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}

