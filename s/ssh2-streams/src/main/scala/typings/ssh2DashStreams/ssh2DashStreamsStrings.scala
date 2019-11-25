package typings.ssh2DashStreams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ssh2DashStreamsStrings {
  @js.native
  sealed trait `CHANNEL_CLOSE:0` extends js.Object
  
  @js.native
  sealed trait `CHANNEL_DATA:0` extends js.Object
  
  @js.native
  sealed trait `CHANNEL_EOF:0` extends js.Object
  
  @js.native
  sealed trait `CHANNEL_EXTENDED_DATA:0` extends js.Object
  
  @js.native
  sealed trait `CHANNEL_FAILURE:0` extends js.Object
  
  @js.native
  sealed trait CHANNEL_OPEN extends js.Object
  
  @js.native
  sealed trait `CHANNEL_OPEN_CONFIRMATION:0` extends js.Object
  
  @js.native
  sealed trait `CHANNEL_OPEN_FAILURE:0` extends js.Object
  
  @js.native
  sealed trait `CHANNEL_REQUEST:0` extends js.Object
  
  @js.native
  sealed trait `CHANNEL_SUCCESS:0` extends js.Object
  
  @js.native
  sealed trait `CHANNEL_WINDOW_ADJUST:0` extends js.Object
  
  @js.native
  sealed trait CLOSE extends js.Object
  
  @js.native
  sealed trait DEBUG extends js.Object
  
  @js.native
  sealed trait DISCONNECT extends js.Object
  
  @js.native
  sealed trait FSETSTAT extends js.Object
  
  @js.native
  sealed trait FSTAT extends js.Object
  
  @js.native
  sealed trait GLOBAL_REQUEST extends js.Object
  
  @js.native
  sealed trait LSTAT extends js.Object
  
  @js.native
  sealed trait MKDIR extends js.Object
  
  @js.native
  sealed trait NEWKEYS extends js.Object
  
  @js.native
  sealed trait OPEN extends js.Object
  
  @js.native
  sealed trait OPENDIR extends js.Object
  
  @js.native
  sealed trait READ extends js.Object
  
  @js.native
  sealed trait READDIR extends js.Object
  
  @js.native
  sealed trait READLINK extends js.Object
  
  @js.native
  sealed trait REALPATH extends js.Object
  
  @js.native
  sealed trait REMOVE extends js.Object
  
  @js.native
  sealed trait RENAME extends js.Object
  
  @js.native
  sealed trait REQUEST_FAILURE extends js.Object
  
  @js.native
  sealed trait REQUEST_SUCCESS extends js.Object
  
  @js.native
  sealed trait RMDIR extends js.Object
  
  @js.native
  sealed trait SERVICE_ACCEPT extends js.Object
  
  @js.native
  sealed trait SERVICE_REQUEST extends js.Object
  
  @js.native
  sealed trait SETSTAT extends js.Object
  
  @js.native
  sealed trait STAT extends js.Object
  
  @js.native
  sealed trait SYMLINK extends js.Object
  
  @js.native
  sealed trait USERAUTH_BANNER extends js.Object
  
  @js.native
  sealed trait USERAUTH_FAILURE extends js.Object
  
  @js.native
  sealed trait USERAUTH_INFO_REQUEST extends js.Object
  
  @js.native
  sealed trait USERAUTH_INFO_RESPONSE extends js.Object
  
  @js.native
  sealed trait USERAUTH_PASSWD_CHANGEREQ extends js.Object
  
  @js.native
  sealed trait USERAUTH_PK_OK extends js.Object
  
  @js.native
  sealed trait USERAUTH_REQUEST extends js.Object
  
  @js.native
  sealed trait USERAUTH_SUCCESS extends js.Object
  
  @js.native
  sealed trait WRITE extends js.Object
  
  @js.native
  sealed trait `auth-agent-req@opensshDOTcom` extends js.Object
  
  @js.native
  sealed trait `auth-agent@opensshDOTcom` extends js.Object
  
  @js.native
  sealed trait close_ extends js.Object
  
  @js.native
  sealed trait continue extends js.Object
  
  @js.native
  sealed trait `direct-streamlocal@opensshDOTcom` extends js.Object
  
  @js.native
  sealed trait `direct-tcpip` extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait env extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait exec extends js.Object
  
  @js.native
  sealed trait `exit-signal` extends js.Object
  
  @js.native
  sealed trait `exit-status` extends js.Object
  
  @js.native
  sealed trait fingerprint extends js.Object
  
  @js.native
  sealed trait `forwarded-streamlocal@opensshDOTcom` extends js.Object
  
  @js.native
  sealed trait `forwarded-tcpip` extends js.Object
  
  @js.native
  sealed trait header extends js.Object
  
  @js.native
  sealed trait `pty-req` extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait session extends js.Object
  
  @js.native
  sealed trait shell extends js.Object
  
  @js.native
  sealed trait signal extends js.Object
  
  @js.native
  sealed trait subsystem extends js.Object
  
  @js.native
  sealed trait `window-change` extends js.Object
  
  @js.native
  sealed trait x11 extends js.Object
  
  @js.native
  sealed trait `x11-req` extends js.Object
  
  @js.native
  sealed trait `xon-xoff` extends js.Object
  
  @scala.inline
  def `CHANNEL_CLOSE:0`: `CHANNEL_CLOSE:0` = "CHANNEL_CLOSE:0".asInstanceOf[`CHANNEL_CLOSE:0`]
  @scala.inline
  def `CHANNEL_DATA:0`: `CHANNEL_DATA:0` = "CHANNEL_DATA:0".asInstanceOf[`CHANNEL_DATA:0`]
  @scala.inline
  def `CHANNEL_EOF:0`: `CHANNEL_EOF:0` = "CHANNEL_EOF:0".asInstanceOf[`CHANNEL_EOF:0`]
  @scala.inline
  def `CHANNEL_EXTENDED_DATA:0`: `CHANNEL_EXTENDED_DATA:0` = "CHANNEL_EXTENDED_DATA:0".asInstanceOf[`CHANNEL_EXTENDED_DATA:0`]
  @scala.inline
  def `CHANNEL_FAILURE:0`: `CHANNEL_FAILURE:0` = "CHANNEL_FAILURE:0".asInstanceOf[`CHANNEL_FAILURE:0`]
  @scala.inline
  def CHANNEL_OPEN: CHANNEL_OPEN = "CHANNEL_OPEN".asInstanceOf[CHANNEL_OPEN]
  @scala.inline
  def `CHANNEL_OPEN_CONFIRMATION:0`: `CHANNEL_OPEN_CONFIRMATION:0` = "CHANNEL_OPEN_CONFIRMATION:0".asInstanceOf[`CHANNEL_OPEN_CONFIRMATION:0`]
  @scala.inline
  def `CHANNEL_OPEN_FAILURE:0`: `CHANNEL_OPEN_FAILURE:0` = "CHANNEL_OPEN_FAILURE:0".asInstanceOf[`CHANNEL_OPEN_FAILURE:0`]
  @scala.inline
  def `CHANNEL_REQUEST:0`: `CHANNEL_REQUEST:0` = "CHANNEL_REQUEST:0".asInstanceOf[`CHANNEL_REQUEST:0`]
  @scala.inline
  def `CHANNEL_SUCCESS:0`: `CHANNEL_SUCCESS:0` = "CHANNEL_SUCCESS:0".asInstanceOf[`CHANNEL_SUCCESS:0`]
  @scala.inline
  def `CHANNEL_WINDOW_ADJUST:0`: `CHANNEL_WINDOW_ADJUST:0` = "CHANNEL_WINDOW_ADJUST:0".asInstanceOf[`CHANNEL_WINDOW_ADJUST:0`]
  @scala.inline
  def CLOSE: CLOSE = "CLOSE".asInstanceOf[CLOSE]
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  @scala.inline
  def DISCONNECT: DISCONNECT = "DISCONNECT".asInstanceOf[DISCONNECT]
  @scala.inline
  def FSETSTAT: FSETSTAT = "FSETSTAT".asInstanceOf[FSETSTAT]
  @scala.inline
  def FSTAT: FSTAT = "FSTAT".asInstanceOf[FSTAT]
  @scala.inline
  def GLOBAL_REQUEST: GLOBAL_REQUEST = "GLOBAL_REQUEST".asInstanceOf[GLOBAL_REQUEST]
  @scala.inline
  def LSTAT: LSTAT = "LSTAT".asInstanceOf[LSTAT]
  @scala.inline
  def MKDIR: MKDIR = "MKDIR".asInstanceOf[MKDIR]
  @scala.inline
  def NEWKEYS: NEWKEYS = "NEWKEYS".asInstanceOf[NEWKEYS]
  @scala.inline
  def OPEN: OPEN = "OPEN".asInstanceOf[OPEN]
  @scala.inline
  def OPENDIR: OPENDIR = "OPENDIR".asInstanceOf[OPENDIR]
  @scala.inline
  def READ: READ = "READ".asInstanceOf[READ]
  @scala.inline
  def READDIR: READDIR = "READDIR".asInstanceOf[READDIR]
  @scala.inline
  def READLINK: READLINK = "READLINK".asInstanceOf[READLINK]
  @scala.inline
  def REALPATH: REALPATH = "REALPATH".asInstanceOf[REALPATH]
  @scala.inline
  def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  @scala.inline
  def RENAME: RENAME = "RENAME".asInstanceOf[RENAME]
  @scala.inline
  def REQUEST_FAILURE: REQUEST_FAILURE = "REQUEST_FAILURE".asInstanceOf[REQUEST_FAILURE]
  @scala.inline
  def REQUEST_SUCCESS: REQUEST_SUCCESS = "REQUEST_SUCCESS".asInstanceOf[REQUEST_SUCCESS]
  @scala.inline
  def RMDIR: RMDIR = "RMDIR".asInstanceOf[RMDIR]
  @scala.inline
  def SERVICE_ACCEPT: SERVICE_ACCEPT = "SERVICE_ACCEPT".asInstanceOf[SERVICE_ACCEPT]
  @scala.inline
  def SERVICE_REQUEST: SERVICE_REQUEST = "SERVICE_REQUEST".asInstanceOf[SERVICE_REQUEST]
  @scala.inline
  def SETSTAT: SETSTAT = "SETSTAT".asInstanceOf[SETSTAT]
  @scala.inline
  def STAT: STAT = "STAT".asInstanceOf[STAT]
  @scala.inline
  def SYMLINK: SYMLINK = "SYMLINK".asInstanceOf[SYMLINK]
  @scala.inline
  def USERAUTH_BANNER: USERAUTH_BANNER = "USERAUTH_BANNER".asInstanceOf[USERAUTH_BANNER]
  @scala.inline
  def USERAUTH_FAILURE: USERAUTH_FAILURE = "USERAUTH_FAILURE".asInstanceOf[USERAUTH_FAILURE]
  @scala.inline
  def USERAUTH_INFO_REQUEST: USERAUTH_INFO_REQUEST = "USERAUTH_INFO_REQUEST".asInstanceOf[USERAUTH_INFO_REQUEST]
  @scala.inline
  def USERAUTH_INFO_RESPONSE: USERAUTH_INFO_RESPONSE = "USERAUTH_INFO_RESPONSE".asInstanceOf[USERAUTH_INFO_RESPONSE]
  @scala.inline
  def USERAUTH_PASSWD_CHANGEREQ: USERAUTH_PASSWD_CHANGEREQ = "USERAUTH_PASSWD_CHANGEREQ".asInstanceOf[USERAUTH_PASSWD_CHANGEREQ]
  @scala.inline
  def USERAUTH_PK_OK: USERAUTH_PK_OK = "USERAUTH_PK_OK".asInstanceOf[USERAUTH_PK_OK]
  @scala.inline
  def USERAUTH_REQUEST: USERAUTH_REQUEST = "USERAUTH_REQUEST".asInstanceOf[USERAUTH_REQUEST]
  @scala.inline
  def USERAUTH_SUCCESS: USERAUTH_SUCCESS = "USERAUTH_SUCCESS".asInstanceOf[USERAUTH_SUCCESS]
  @scala.inline
  def WRITE: WRITE = "WRITE".asInstanceOf[WRITE]
  @scala.inline
  def `auth-agent-req@opensshDOTcom`: `auth-agent-req@opensshDOTcom` = "auth-agent-req@openssh.com".asInstanceOf[`auth-agent-req@opensshDOTcom`]
  @scala.inline
  def `auth-agent@opensshDOTcom`: `auth-agent@opensshDOTcom` = "auth-agent@openssh.com".asInstanceOf[`auth-agent@opensshDOTcom`]
  @scala.inline
  def close_ : close_ = "close".asInstanceOf[close_]
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  @scala.inline
  def `direct-streamlocal@opensshDOTcom`: `direct-streamlocal@opensshDOTcom` = "direct-streamlocal@openssh.com".asInstanceOf[`direct-streamlocal@opensshDOTcom`]
  @scala.inline
  def `direct-tcpip`: `direct-tcpip` = "direct-tcpip".asInstanceOf[`direct-tcpip`]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def env: env = "env".asInstanceOf[env]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def exec: exec = "exec".asInstanceOf[exec]
  @scala.inline
  def `exit-signal`: `exit-signal` = "exit-signal".asInstanceOf[`exit-signal`]
  @scala.inline
  def `exit-status`: `exit-status` = "exit-status".asInstanceOf[`exit-status`]
  @scala.inline
  def fingerprint: fingerprint = "fingerprint".asInstanceOf[fingerprint]
  @scala.inline
  def `forwarded-streamlocal@opensshDOTcom`: `forwarded-streamlocal@opensshDOTcom` = "forwarded-streamlocal@openssh.com".asInstanceOf[`forwarded-streamlocal@opensshDOTcom`]
  @scala.inline
  def `forwarded-tcpip`: `forwarded-tcpip` = "forwarded-tcpip".asInstanceOf[`forwarded-tcpip`]
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  @scala.inline
  def `pty-req`: `pty-req` = "pty-req".asInstanceOf[`pty-req`]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  @scala.inline
  def shell: shell = "shell".asInstanceOf[shell]
  @scala.inline
  def signal: signal = "signal".asInstanceOf[signal]
  @scala.inline
  def subsystem: subsystem = "subsystem".asInstanceOf[subsystem]
  @scala.inline
  def `window-change`: `window-change` = "window-change".asInstanceOf[`window-change`]
  @scala.inline
  def x11: x11 = "x11".asInstanceOf[x11]
  @scala.inline
  def `x11-req`: `x11-req` = "x11-req".asInstanceOf[`x11-req`]
  @scala.inline
  def `xon-xoff`: `xon-xoff` = "xon-xoff".asInstanceOf[`xon-xoff`]
}

