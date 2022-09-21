package typings.ssh2

import typings.ssh2.mod.AuthenticationType
import typings.ssh2.mod.ChannelSubType
import typings.ssh2.mod.ChannelType
import typings.ssh2.mod.CipherAlgorithm
import typings.ssh2.mod.CompressionAlgorithm
import typings.ssh2.mod.KexAlgorithm
import typings.ssh2.mod.KeyType
import typings.ssh2.mod.MacAlgorithm
import typings.ssh2.mod.OpenMode
import typings.ssh2.mod.ServerHostKeyAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssh2Strings {
  
  @js.native
  sealed trait `3des-cbc`
    extends StObject
       with CipherAlgorithm
  inline def `3des-cbc`: `3des-cbc` = "3des-cbc".asInstanceOf[`3des-cbc`]
  
  @js.native
  sealed trait CLOSE extends StObject
  inline def CLOSE: CLOSE = "CLOSE".asInstanceOf[CLOSE]
  
  @js.native
  sealed trait EXTENDED extends StObject
  inline def EXTENDED: EXTENDED = "EXTENDED".asInstanceOf[EXTENDED]
  
  @js.native
  sealed trait FSETSTAT extends StObject
  inline def FSETSTAT: FSETSTAT = "FSETSTAT".asInstanceOf[FSETSTAT]
  
  @js.native
  sealed trait FSTAT extends StObject
  inline def FSTAT: FSTAT = "FSTAT".asInstanceOf[FSTAT]
  
  @js.native
  sealed trait LSTAT extends StObject
  inline def LSTAT: LSTAT = "LSTAT".asInstanceOf[LSTAT]
  
  @js.native
  sealed trait MKDIR extends StObject
  inline def MKDIR: MKDIR = "MKDIR".asInstanceOf[MKDIR]
  
  @js.native
  sealed trait OPEN extends StObject
  inline def OPEN: OPEN = "OPEN".asInstanceOf[OPEN]
  
  @js.native
  sealed trait OPENDIR extends StObject
  inline def OPENDIR: OPENDIR = "OPENDIR".asInstanceOf[OPENDIR]
  
  @js.native
  sealed trait READ extends StObject
  inline def READ: READ = "READ".asInstanceOf[READ]
  
  @js.native
  sealed trait READDIR extends StObject
  inline def READDIR: READDIR = "READDIR".asInstanceOf[READDIR]
  
  @js.native
  sealed trait READLINK extends StObject
  inline def READLINK: READLINK = "READLINK".asInstanceOf[READLINK]
  
  @js.native
  sealed trait REALPATH extends StObject
  inline def REALPATH: REALPATH = "REALPATH".asInstanceOf[REALPATH]
  
  @js.native
  sealed trait REMOVE extends StObject
  inline def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait RENAME extends StObject
  inline def RENAME: RENAME = "RENAME".asInstanceOf[RENAME]
  
  @js.native
  sealed trait RMDIR extends StObject
  inline def RMDIR: RMDIR = "RMDIR".asInstanceOf[RMDIR]
  
  @js.native
  sealed trait SETSTAT extends StObject
  inline def SETSTAT: SETSTAT = "SETSTAT".asInstanceOf[SETSTAT]
  
  @js.native
  sealed trait STAT extends StObject
  inline def STAT: STAT = "STAT".asInstanceOf[STAT]
  
  @js.native
  sealed trait SYMLINK extends StObject
  inline def SYMLINK: SYMLINK = "SYMLINK".asInstanceOf[SYMLINK]
  
  @js.native
  sealed trait WRITE extends StObject
  inline def WRITE: WRITE = "WRITE".asInstanceOf[WRITE]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait a
    extends StObject
       with OpenMode
  inline def a: a = "a".asInstanceOf[a]
  
  @js.native
  sealed trait aPlussign
    extends StObject
       with OpenMode
  inline def aPlussign: aPlussign = "a+".asInstanceOf[aPlussign]
  
  @js.native
  sealed trait abort extends StObject
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait `aes128-cbc`
    extends StObject
       with CipherAlgorithm
  inline def `aes128-cbc`: `aes128-cbc` = "aes128-cbc".asInstanceOf[`aes128-cbc`]
  
  @js.native
  sealed trait `aes128-ctr`
    extends StObject
       with CipherAlgorithm
  inline def `aes128-ctr`: `aes128-ctr` = "aes128-ctr".asInstanceOf[`aes128-ctr`]
  
  @js.native
  sealed trait `aes128-gcm@opensshDotcom`
    extends StObject
       with CipherAlgorithm
  inline def `aes128-gcm@opensshDotcom`: `aes128-gcm@opensshDotcom` = "aes128-gcm@openssh.com".asInstanceOf[`aes128-gcm@opensshDotcom`]
  
  @js.native
  sealed trait `aes192-cbc`
    extends StObject
       with CipherAlgorithm
  inline def `aes192-cbc`: `aes192-cbc` = "aes192-cbc".asInstanceOf[`aes192-cbc`]
  
  @js.native
  sealed trait `aes192-ctr`
    extends StObject
       with CipherAlgorithm
  inline def `aes192-ctr`: `aes192-ctr` = "aes192-ctr".asInstanceOf[`aes192-ctr`]
  
  @js.native
  sealed trait `aes256-cbc`
    extends StObject
       with CipherAlgorithm
  inline def `aes256-cbc`: `aes256-cbc` = "aes256-cbc".asInstanceOf[`aes256-cbc`]
  
  @js.native
  sealed trait `aes256-ctr`
    extends StObject
       with CipherAlgorithm
  inline def `aes256-ctr`: `aes256-ctr` = "aes256-ctr".asInstanceOf[`aes256-ctr`]
  
  @js.native
  sealed trait `aes256-gcm@opensshDotcom`
    extends StObject
       with CipherAlgorithm
  inline def `aes256-gcm@opensshDotcom`: `aes256-gcm@opensshDotcom` = "aes256-gcm@openssh.com".asInstanceOf[`aes256-gcm@opensshDotcom`]
  
  @js.native
  sealed trait agent
    extends StObject
       with AuthenticationType
  inline def agent: agent = "agent".asInstanceOf[agent]
  
  @js.native
  sealed trait append extends StObject
  inline def append: append = "append".asInstanceOf[append]
  
  @js.native
  sealed trait arcfour
    extends StObject
       with CipherAlgorithm
  inline def arcfour: arcfour = "arcfour".asInstanceOf[arcfour]
  
  @js.native
  sealed trait arcfour128
    extends StObject
       with CipherAlgorithm
  inline def arcfour128: arcfour128 = "arcfour128".asInstanceOf[arcfour128]
  
  @js.native
  sealed trait arcfour256
    extends StObject
       with CipherAlgorithm
  inline def arcfour256: arcfour256 = "arcfour256".asInstanceOf[arcfour256]
  
  @js.native
  sealed trait `auth-agent` extends StObject
  inline def `auth-agent`: `auth-agent` = "auth-agent".asInstanceOf[`auth-agent`]
  
  @js.native
  sealed trait authentication extends StObject
  inline def authentication: authentication = "authentication".asInstanceOf[authentication]
  
  @js.native
  sealed trait ax
    extends StObject
       with OpenMode
  inline def ax: ax = "ax".asInstanceOf[ax]
  
  @js.native
  sealed trait axPlussign
    extends StObject
       with OpenMode
  inline def axPlussign: axPlussign = "ax+".asInstanceOf[axPlussign]
  
  @js.native
  sealed trait banner extends StObject
  inline def banner: banner = "banner".asInstanceOf[banner]
  
  @js.native
  sealed trait `blowfish-cbc`
    extends StObject
       with CipherAlgorithm
  inline def `blowfish-cbc`: `blowfish-cbc` = "blowfish-cbc".asInstanceOf[`blowfish-cbc`]
  
  @js.native
  sealed trait `cancel-streamlocal-forward@opensshDotcom` extends StObject
  inline def `cancel-streamlocal-forward@opensshDotcom`: `cancel-streamlocal-forward@opensshDotcom` = "cancel-streamlocal-forward@openssh.com".asInstanceOf[`cancel-streamlocal-forward@opensshDotcom`]
  
  @js.native
  sealed trait `cancel-tcpip-forward` extends StObject
  inline def `cancel-tcpip-forward`: `cancel-tcpip-forward` = "cancel-tcpip-forward".asInstanceOf[`cancel-tcpip-forward`]
  
  @js.native
  sealed trait `cast128-cbc`
    extends StObject
       with CipherAlgorithm
  inline def `cast128-cbc`: `cast128-cbc` = "cast128-cbc".asInstanceOf[`cast128-cbc`]
  
  @js.native
  sealed trait `chacha20-poly1305@opensshDotcom`
    extends StObject
       with CipherAlgorithm
  inline def `chacha20-poly1305@opensshDotcom`: `chacha20-poly1305@opensshDotcom` = "chacha20-poly1305@openssh.com".asInstanceOf[`chacha20-poly1305@opensshDotcom`]
  
  @js.native
  sealed trait `change password` extends StObject
  inline def `change password`: `change password` = ("change password").asInstanceOf[`change password`]
  
  @js.native
  sealed trait close_ extends StObject
  inline def close_ : close_ = "close".asInstanceOf[close_]
  
  @js.native
  sealed trait connect extends StObject
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait connection extends StObject
  inline def connection: connection = "connection".asInstanceOf[connection]
  
  @js.native
  sealed trait `curve25519-sha256`
    extends StObject
       with KexAlgorithm
  inline def `curve25519-sha256`: `curve25519-sha256` = "curve25519-sha256".asInstanceOf[`curve25519-sha256`]
  
  @js.native
  sealed trait `curve25519-sha256@libsshDotorg`
    extends StObject
       with KexAlgorithm
  inline def `curve25519-sha256@libsshDotorg`: `curve25519-sha256@libsshDotorg` = "curve25519-sha256@libssh.org".asInstanceOf[`curve25519-sha256@libsshDotorg`]
  
  @js.native
  sealed trait `diffie-hellman-group-exchange-sha1`
    extends StObject
       with KexAlgorithm
  inline def `diffie-hellman-group-exchange-sha1`: `diffie-hellman-group-exchange-sha1` = "diffie-hellman-group-exchange-sha1".asInstanceOf[`diffie-hellman-group-exchange-sha1`]
  
  @js.native
  sealed trait `diffie-hellman-group-exchange-sha256`
    extends StObject
       with KexAlgorithm
  inline def `diffie-hellman-group-exchange-sha256`: `diffie-hellman-group-exchange-sha256` = "diffie-hellman-group-exchange-sha256".asInstanceOf[`diffie-hellman-group-exchange-sha256`]
  
  @js.native
  sealed trait `diffie-hellman-group1-sha1`
    extends StObject
       with KexAlgorithm
  inline def `diffie-hellman-group1-sha1`: `diffie-hellman-group1-sha1` = "diffie-hellman-group1-sha1".asInstanceOf[`diffie-hellman-group1-sha1`]
  
  @js.native
  sealed trait `diffie-hellman-group14-sha1`
    extends StObject
       with KexAlgorithm
  inline def `diffie-hellman-group14-sha1`: `diffie-hellman-group14-sha1` = "diffie-hellman-group14-sha1".asInstanceOf[`diffie-hellman-group14-sha1`]
  
  @js.native
  sealed trait `diffie-hellman-group14-sha256`
    extends StObject
       with KexAlgorithm
  inline def `diffie-hellman-group14-sha256`: `diffie-hellman-group14-sha256` = "diffie-hellman-group14-sha256".asInstanceOf[`diffie-hellman-group14-sha256`]
  
  @js.native
  sealed trait `diffie-hellman-group15-sha512`
    extends StObject
       with KexAlgorithm
  inline def `diffie-hellman-group15-sha512`: `diffie-hellman-group15-sha512` = "diffie-hellman-group15-sha512".asInstanceOf[`diffie-hellman-group15-sha512`]
  
  @js.native
  sealed trait `diffie-hellman-group16-sha512`
    extends StObject
       with KexAlgorithm
  inline def `diffie-hellman-group16-sha512`: `diffie-hellman-group16-sha512` = "diffie-hellman-group16-sha512".asInstanceOf[`diffie-hellman-group16-sha512`]
  
  @js.native
  sealed trait `diffie-hellman-group17-sha512`
    extends StObject
       with KexAlgorithm
  inline def `diffie-hellman-group17-sha512`: `diffie-hellman-group17-sha512` = "diffie-hellman-group17-sha512".asInstanceOf[`diffie-hellman-group17-sha512`]
  
  @js.native
  sealed trait `diffie-hellman-group18-sha512`
    extends StObject
       with KexAlgorithm
  inline def `diffie-hellman-group18-sha512`: `diffie-hellman-group18-sha512` = "diffie-hellman-group18-sha512".asInstanceOf[`diffie-hellman-group18-sha512`]
  
  @js.native
  sealed trait `direct-streamlocal@opensshDotcom`
    extends StObject
       with ChannelType
  inline def `direct-streamlocal@opensshDotcom`: `direct-streamlocal@opensshDotcom` = "direct-streamlocal@openssh.com".asInstanceOf[`direct-streamlocal@opensshDotcom`]
  
  @js.native
  sealed trait `direct-tcpip`
    extends StObject
       with ChannelType
  inline def `direct-tcpip`: `direct-tcpip` = "direct-tcpip".asInstanceOf[`direct-tcpip`]
  
  @js.native
  sealed trait `ecdh-sha2-nistp256`
    extends StObject
       with KexAlgorithm
  inline def `ecdh-sha2-nistp256`: `ecdh-sha2-nistp256` = "ecdh-sha2-nistp256".asInstanceOf[`ecdh-sha2-nistp256`]
  
  @js.native
  sealed trait `ecdh-sha2-nistp384`
    extends StObject
       with KexAlgorithm
  inline def `ecdh-sha2-nistp384`: `ecdh-sha2-nistp384` = "ecdh-sha2-nistp384".asInstanceOf[`ecdh-sha2-nistp384`]
  
  @js.native
  sealed trait `ecdh-sha2-nistp521`
    extends StObject
       with KexAlgorithm
  inline def `ecdh-sha2-nistp521`: `ecdh-sha2-nistp521` = "ecdh-sha2-nistp521".asInstanceOf[`ecdh-sha2-nistp521`]
  
  @js.native
  sealed trait `ecdsa-sha2-nistp256`
    extends StObject
       with KeyType
       with ServerHostKeyAlgorithm
  inline def `ecdsa-sha2-nistp256`: `ecdsa-sha2-nistp256` = "ecdsa-sha2-nistp256".asInstanceOf[`ecdsa-sha2-nistp256`]
  
  @js.native
  sealed trait `ecdsa-sha2-nistp384`
    extends StObject
       with KeyType
       with ServerHostKeyAlgorithm
  inline def `ecdsa-sha2-nistp384`: `ecdsa-sha2-nistp384` = "ecdsa-sha2-nistp384".asInstanceOf[`ecdsa-sha2-nistp384`]
  
  @js.native
  sealed trait `ecdsa-sha2-nistp521`
    extends StObject
       with KeyType
       with ServerHostKeyAlgorithm
  inline def `ecdsa-sha2-nistp521`: `ecdsa-sha2-nistp521` = "ecdsa-sha2-nistp521".asInstanceOf[`ecdsa-sha2-nistp521`]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait env extends StObject
  inline def env: env = "env".asInstanceOf[env]
  
  @js.native
  sealed trait eof extends StObject
  inline def eof: eof = "eof".asInstanceOf[eof]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait exec
    extends StObject
       with ChannelSubType
  inline def exec: exec = "exec".asInstanceOf[exec]
  
  @js.native
  sealed trait exit extends StObject
  inline def exit: exit = "exit".asInstanceOf[exit]
  
  @js.native
  sealed trait greeting extends StObject
  inline def greeting: greeting = "greeting".asInstanceOf[greeting]
  
  @js.native
  sealed trait handshake extends StObject
  inline def handshake: handshake = "handshake".asInstanceOf[handshake]
  
  @js.native
  sealed trait `hmac-md5`
    extends StObject
       with MacAlgorithm
  inline def `hmac-md5`: `hmac-md5` = "hmac-md5".asInstanceOf[`hmac-md5`]
  
  @js.native
  sealed trait `hmac-md5-96`
    extends StObject
       with MacAlgorithm
  inline def `hmac-md5-96`: `hmac-md5-96` = "hmac-md5-96".asInstanceOf[`hmac-md5-96`]
  
  @js.native
  sealed trait `hmac-ripemd160`
    extends StObject
       with MacAlgorithm
  inline def `hmac-ripemd160`: `hmac-ripemd160` = "hmac-ripemd160".asInstanceOf[`hmac-ripemd160`]
  
  @js.native
  sealed trait `hmac-sha1`
    extends StObject
       with MacAlgorithm
  inline def `hmac-sha1`: `hmac-sha1` = "hmac-sha1".asInstanceOf[`hmac-sha1`]
  
  @js.native
  sealed trait `hmac-sha1-96`
    extends StObject
       with MacAlgorithm
  inline def `hmac-sha1-96`: `hmac-sha1-96` = "hmac-sha1-96".asInstanceOf[`hmac-sha1-96`]
  
  @js.native
  sealed trait `hmac-sha1-etm@opensshDotcom`
    extends StObject
       with MacAlgorithm
  inline def `hmac-sha1-etm@opensshDotcom`: `hmac-sha1-etm@opensshDotcom` = "hmac-sha1-etm@openssh.com".asInstanceOf[`hmac-sha1-etm@opensshDotcom`]
  
  @js.native
  sealed trait `hmac-sha2-256`
    extends StObject
       with MacAlgorithm
  inline def `hmac-sha2-256`: `hmac-sha2-256` = "hmac-sha2-256".asInstanceOf[`hmac-sha2-256`]
  
  @js.native
  sealed trait `hmac-sha2-256-96`
    extends StObject
       with MacAlgorithm
  inline def `hmac-sha2-256-96`: `hmac-sha2-256-96` = "hmac-sha2-256-96".asInstanceOf[`hmac-sha2-256-96`]
  
  @js.native
  sealed trait `hmac-sha2-256-etm@opensshDotcom`
    extends StObject
       with MacAlgorithm
  inline def `hmac-sha2-256-etm@opensshDotcom`: `hmac-sha2-256-etm@opensshDotcom` = "hmac-sha2-256-etm@openssh.com".asInstanceOf[`hmac-sha2-256-etm@opensshDotcom`]
  
  @js.native
  sealed trait `hmac-sha2-512`
    extends StObject
       with MacAlgorithm
  inline def `hmac-sha2-512`: `hmac-sha2-512` = "hmac-sha2-512".asInstanceOf[`hmac-sha2-512`]
  
  @js.native
  sealed trait `hmac-sha2-512-96`
    extends StObject
       with MacAlgorithm
  inline def `hmac-sha2-512-96`: `hmac-sha2-512-96` = "hmac-sha2-512-96".asInstanceOf[`hmac-sha2-512-96`]
  
  @js.native
  sealed trait `hmac-sha2-512-etm@opensshDotcom`
    extends StObject
       with MacAlgorithm
  inline def `hmac-sha2-512-etm@opensshDotcom`: `hmac-sha2-512-etm@opensshDotcom` = "hmac-sha2-512-etm@openssh.com".asInstanceOf[`hmac-sha2-512-etm@opensshDotcom`]
  
  @js.native
  sealed trait hostbased
    extends StObject
       with AuthenticationType
  inline def hostbased: hostbased = "hostbased".asInstanceOf[hostbased]
  
  @js.native
  sealed trait hostkeys extends StObject
  inline def hostkeys: hostkeys = "hostkeys".asInstanceOf[hostkeys]
  
  @js.native
  sealed trait identities extends StObject
  inline def identities: identities = "identities".asInstanceOf[identities]
  
  @js.native
  sealed trait `keyboard-interactive`
    extends StObject
       with AuthenticationType
  inline def `keyboard-interactive`: `keyboard-interactive` = "keyboard-interactive".asInstanceOf[`keyboard-interactive`]
  
  @js.native
  sealed trait none
    extends StObject
       with AuthenticationType
       with CompressionAlgorithm
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait open_ extends StObject
  inline def open_ : open_ = "open".asInstanceOf[open_]
  
  @js.native
  sealed trait opensshDotstreamlocal extends StObject
  inline def opensshDotstreamlocal: opensshDotstreamlocal = "openssh.streamlocal".asInstanceOf[opensshDotstreamlocal]
  
  @js.native
  sealed trait pageant extends StObject
  inline def pageant: pageant = "pageant".asInstanceOf[pageant]
  
  @js.native
  sealed trait password
    extends StObject
       with AuthenticationType
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait prepend extends StObject
  inline def prepend: prepend = "prepend".asInstanceOf[prepend]
  
  @js.native
  sealed trait pty extends StObject
  inline def pty: pty = "pty".asInstanceOf[pty]
  
  @js.native
  sealed trait publickey
    extends StObject
       with AuthenticationType
  inline def publickey: publickey = "publickey".asInstanceOf[publickey]
  
  @js.native
  sealed trait r
    extends StObject
       with OpenMode
  inline def r: r = "r".asInstanceOf[r]
  
  @js.native
  sealed trait rPlussign
    extends StObject
       with OpenMode
  inline def rPlussign: rPlussign = "r+".asInstanceOf[rPlussign]
  
  @js.native
  sealed trait ready extends StObject
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait rekey extends StObject
  inline def rekey: rekey = "rekey".asInstanceOf[rekey]
  
  @js.native
  sealed trait remove_ extends StObject
  inline def remove_ : remove_ = "remove".asInstanceOf[remove_]
  
  @js.native
  sealed trait request extends StObject
  inline def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait `rsa-sha2-256`
    extends StObject
       with ServerHostKeyAlgorithm
  inline def `rsa-sha2-256`: `rsa-sha2-256` = "rsa-sha2-256".asInstanceOf[`rsa-sha2-256`]
  
  @js.native
  sealed trait `rsa-sha2-512`
    extends StObject
       with ServerHostKeyAlgorithm
  inline def `rsa-sha2-512`: `rsa-sha2-512` = "rsa-sha2-512".asInstanceOf[`rsa-sha2-512`]
  
  @js.native
  sealed trait session
    extends StObject
       with ChannelType
  inline def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait sftp
    extends StObject
       with ChannelType
  inline def sftp: sftp = "sftp".asInstanceOf[sftp]
  
  @js.native
  sealed trait sha256 extends StObject
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha512 extends StObject
  inline def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @js.native
  sealed trait shell
    extends StObject
       with ChannelSubType
  inline def shell: shell = "shell".asInstanceOf[shell]
  
  @js.native
  sealed trait sign extends StObject
  inline def sign: sign = "sign".asInstanceOf[sign]
  
  @js.native
  sealed trait signal extends StObject
  inline def signal: signal = "signal".asInstanceOf[signal]
  
  @js.native
  sealed trait `ssh-dss`
    extends StObject
       with KeyType
       with ServerHostKeyAlgorithm
  inline def `ssh-dss`: `ssh-dss` = "ssh-dss".asInstanceOf[`ssh-dss`]
  
  @js.native
  sealed trait `ssh-ed25519`
    extends StObject
       with KeyType
       with ServerHostKeyAlgorithm
  inline def `ssh-ed25519`: `ssh-ed25519` = "ssh-ed25519".asInstanceOf[`ssh-ed25519`]
  
  @js.native
  sealed trait `ssh-rsa`
    extends StObject
       with KeyType
       with ServerHostKeyAlgorithm
  inline def `ssh-rsa`: `ssh-rsa` = "ssh-rsa".asInstanceOf[`ssh-rsa`]
  
  @js.native
  sealed trait `streamlocal-forward@opensshDotcom` extends StObject
  inline def `streamlocal-forward@opensshDotcom`: `streamlocal-forward@opensshDotcom` = "streamlocal-forward@openssh.com".asInstanceOf[`streamlocal-forward@opensshDotcom`]
  
  @js.native
  sealed trait subsystem extends StObject
  inline def subsystem: subsystem = "subsystem".asInstanceOf[subsystem]
  
  @js.native
  sealed trait `tcp connection` extends StObject
  inline def `tcp connection`: `tcp connection` = ("tcp connection").asInstanceOf[`tcp connection`]
  
  @js.native
  sealed trait tcpip extends StObject
  inline def tcpip: tcpip = "tcpip".asInstanceOf[tcpip]
  
  @js.native
  sealed trait `tcpip-forward` extends StObject
  inline def `tcpip-forward`: `tcpip-forward` = "tcpip-forward".asInstanceOf[`tcpip-forward`]
  
  @js.native
  sealed trait timeout extends StObject
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait `unix connection` extends StObject
  inline def `unix connection`: `unix connection` = ("unix connection").asInstanceOf[`unix connection`]
  
  @js.native
  sealed trait w
    extends StObject
       with OpenMode
  inline def w: w = "w".asInstanceOf[w]
  
  @js.native
  sealed trait wPlussign
    extends StObject
       with OpenMode
  inline def wPlussign: wPlussign = "w+".asInstanceOf[wPlussign]
  
  @js.native
  sealed trait `window-change` extends StObject
  inline def `window-change`: `window-change` = "window-change".asInstanceOf[`window-change`]
  
  @js.native
  sealed trait wx
    extends StObject
       with OpenMode
  inline def wx: wx = "wx".asInstanceOf[wx]
  
  @js.native
  sealed trait x11 extends StObject
  inline def x11: x11 = "x11".asInstanceOf[x11]
  
  @js.native
  sealed trait xa
    extends StObject
       with OpenMode
  inline def xa: xa = "xa".asInstanceOf[xa]
  
  @js.native
  sealed trait xaPlussign
    extends StObject
       with OpenMode
  inline def xaPlussign: xaPlussign = "xa+".asInstanceOf[xaPlussign]
  
  @js.native
  sealed trait xw
    extends StObject
       with OpenMode
  inline def xw: xw = "xw".asInstanceOf[xw]
  
  @js.native
  sealed trait xwPlussign
    extends StObject
       with OpenMode
  inline def xwPlussign: xwPlussign = "xw+".asInstanceOf[xwPlussign]
  
  @js.native
  sealed trait zlib
    extends StObject
       with CompressionAlgorithm
  inline def zlib: zlib = "zlib".asInstanceOf[zlib]
  
  @js.native
  sealed trait `zlib@opensshDotcom`
    extends StObject
       with CompressionAlgorithm
  inline def `zlib@opensshDotcom`: `zlib@opensshDotcom` = "zlib@openssh.com".asInstanceOf[`zlib@opensshDotcom`]
}
