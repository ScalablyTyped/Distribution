package typings.qbittorrentApiV2

import typings.qbittorrentApiV2.mod.LogTypesString
import typings.qbittorrentApiV2.mod.filterString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qbittorrentApiV2Strings {
  
  @js.native
  sealed trait active
    extends StObject
       with filterString
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait all
    extends StObject
       with filterString
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait completed
    extends StObject
       with filterString
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait critical
    extends StObject
       with LogTypesString
  inline def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait downloading
    extends StObject
       with filterString
  inline def downloading: downloading = "downloading".asInstanceOf[downloading]
  
  @js.native
  sealed trait enabled extends StObject
  inline def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait inactive
    extends StObject
       with filterString
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait info
    extends StObject
       with LogTypesString
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait normal
    extends StObject
       with LogTypesString
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait paused
    extends StObject
       with filterString
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait resumed
    extends StObject
       with filterString
  inline def resumed: resumed = "resumed".asInstanceOf[resumed]
  
  @js.native
  sealed trait warning
    extends StObject
       with LogTypesString
  inline def warning: warning = "warning".asInstanceOf[warning]
}
