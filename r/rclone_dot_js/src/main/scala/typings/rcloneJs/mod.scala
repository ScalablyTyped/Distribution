package typings.rcloneJs

import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import typings.node.nodeChildProcessMod.ChildProcess
import typings.rcloneJs.anon.Promises
import typings.rcloneJs.anon.RecordCommandApiFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rclone.js", JSImport.Namespace)
  @js.native
  val ^ : ApiFn & RecordCommandApiFn & Promises = js.native
  
  type ApiFn = FnStringOrObjectArgs[ChildProcess]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcloneJs.rcloneJsStrings.about
    - typings.rcloneJs.rcloneJsStrings.authorize
    - typings.rcloneJs.rcloneJsStrings.backend
    - typings.rcloneJs.rcloneJsStrings.cat
    - typings.rcloneJs.rcloneJsStrings.check
    - typings.rcloneJs.rcloneJsStrings.checksum
    - typings.rcloneJs.rcloneJsStrings.cleanup
    - typings.rcloneJs.rcloneJsStrings.config
    - typings.rcloneJs.rcloneJsStrings.`config create`
    - typings.rcloneJs.rcloneJsStrings.`config delete`
    - typings.rcloneJs.rcloneJsStrings.`config disconnect`
    - typings.rcloneJs.rcloneJsStrings.`config dump`
    - typings.rcloneJs.rcloneJsStrings.`config edit`
    - typings.rcloneJs.rcloneJsStrings.`config file`
    - typings.rcloneJs.rcloneJsStrings.`config password`
    - typings.rcloneJs.rcloneJsStrings.`config providers`
    - typings.rcloneJs.rcloneJsStrings.`config reconnect`
    - typings.rcloneJs.rcloneJsStrings.`config show`
    - typings.rcloneJs.rcloneJsStrings.`config update`
    - typings.rcloneJs.rcloneJsStrings.`config userinfo`
    - typings.rcloneJs.rcloneJsStrings.copy
    - typings.rcloneJs.rcloneJsStrings.copyto
    - typings.rcloneJs.rcloneJsStrings.copyurl
    - typings.rcloneJs.rcloneJsStrings.cryptcheck
    - typings.rcloneJs.rcloneJsStrings.cryptdecode
    - typings.rcloneJs.rcloneJsStrings.dedupe
    - typings.rcloneJs.rcloneJsStrings.delete
    - typings.rcloneJs.rcloneJsStrings.deletefile
    - typings.rcloneJs.rcloneJsStrings.genautocomplete
    - typings.rcloneJs.rcloneJsStrings.`genautocomplete bash`
    - typings.rcloneJs.rcloneJsStrings.`genautocomplete fish`
    - typings.rcloneJs.rcloneJsStrings.`genautocomplete zsh`
    - typings.rcloneJs.rcloneJsStrings.gendocs
    - typings.rcloneJs.rcloneJsStrings.hashsum
    - typings.rcloneJs.rcloneJsStrings.help
    - typings.rcloneJs.rcloneJsStrings.link
    - typings.rcloneJs.rcloneJsStrings.listremotes
    - typings.rcloneJs.rcloneJsStrings.ls
    - typings.rcloneJs.rcloneJsStrings.lsd
    - typings.rcloneJs.rcloneJsStrings.lsf
    - typings.rcloneJs.rcloneJsStrings.lsjson
    - typings.rcloneJs.rcloneJsStrings.lsl
    - typings.rcloneJs.rcloneJsStrings.md5sum
    - typings.rcloneJs.rcloneJsStrings.mkdir
    - typings.rcloneJs.rcloneJsStrings.mount
    - typings.rcloneJs.rcloneJsStrings.move
    - typings.rcloneJs.rcloneJsStrings.moveto
    - typings.rcloneJs.rcloneJsStrings.ncdu
    - typings.rcloneJs.rcloneJsStrings.obscure
    - typings.rcloneJs.rcloneJsStrings.purge
    - typings.rcloneJs.rcloneJsStrings.rc
    - typings.rcloneJs.rcloneJsStrings.rcat
    - typings.rcloneJs.rcloneJsStrings.rcd
    - typings.rcloneJs.rcloneJsStrings.rmdir
    - typings.rcloneJs.rcloneJsStrings.rmdirs
    - typings.rcloneJs.rcloneJsStrings.selfupdate
    - typings.rcloneJs.rcloneJsStrings.serve
    - typings.rcloneJs.rcloneJsStrings.`serve dlna`
    - typings.rcloneJs.rcloneJsStrings.`serve ftp`
    - typings.rcloneJs.rcloneJsStrings.`serve http`
    - typings.rcloneJs.rcloneJsStrings.`serve restic`
    - typings.rcloneJs.rcloneJsStrings.`serve sftp`
    - typings.rcloneJs.rcloneJsStrings.`serve webdav`
    - typings.rcloneJs.rcloneJsStrings.settier
    - typings.rcloneJs.rcloneJsStrings.sha1sum
    - typings.rcloneJs.rcloneJsStrings.size
    - typings.rcloneJs.rcloneJsStrings.sync
    - typings.rcloneJs.rcloneJsStrings.test
    - typings.rcloneJs.rcloneJsStrings.touch
    - typings.rcloneJs.rcloneJsStrings.tree
    - typings.rcloneJs.rcloneJsStrings.version
  */
  trait Command extends StObject
  object Command {
    
    inline def about: typings.rcloneJs.rcloneJsStrings.about = "about".asInstanceOf[typings.rcloneJs.rcloneJsStrings.about]
    
    inline def authorize: typings.rcloneJs.rcloneJsStrings.authorize = "authorize".asInstanceOf[typings.rcloneJs.rcloneJsStrings.authorize]
    
    inline def backend: typings.rcloneJs.rcloneJsStrings.backend = "backend".asInstanceOf[typings.rcloneJs.rcloneJsStrings.backend]
    
    inline def cat: typings.rcloneJs.rcloneJsStrings.cat = "cat".asInstanceOf[typings.rcloneJs.rcloneJsStrings.cat]
    
    inline def check: typings.rcloneJs.rcloneJsStrings.check = "check".asInstanceOf[typings.rcloneJs.rcloneJsStrings.check]
    
    inline def checksum: typings.rcloneJs.rcloneJsStrings.checksum = "checksum".asInstanceOf[typings.rcloneJs.rcloneJsStrings.checksum]
    
    inline def cleanup: typings.rcloneJs.rcloneJsStrings.cleanup = "cleanup".asInstanceOf[typings.rcloneJs.rcloneJsStrings.cleanup]
    
    inline def config: typings.rcloneJs.rcloneJsStrings.config = "config".asInstanceOf[typings.rcloneJs.rcloneJsStrings.config]
    
    inline def `config create`: typings.rcloneJs.rcloneJsStrings.`config create` = ("config create").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config create`]
    
    inline def `config delete`: typings.rcloneJs.rcloneJsStrings.`config delete` = ("config delete").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config delete`]
    
    inline def `config disconnect`: typings.rcloneJs.rcloneJsStrings.`config disconnect` = ("config disconnect").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config disconnect`]
    
    inline def `config dump`: typings.rcloneJs.rcloneJsStrings.`config dump` = ("config dump").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config dump`]
    
    inline def `config edit`: typings.rcloneJs.rcloneJsStrings.`config edit` = ("config edit").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config edit`]
    
    inline def `config file`: typings.rcloneJs.rcloneJsStrings.`config file` = ("config file").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config file`]
    
    inline def `config password`: typings.rcloneJs.rcloneJsStrings.`config password` = ("config password").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config password`]
    
    inline def `config providers`: typings.rcloneJs.rcloneJsStrings.`config providers` = ("config providers").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config providers`]
    
    inline def `config reconnect`: typings.rcloneJs.rcloneJsStrings.`config reconnect` = ("config reconnect").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config reconnect`]
    
    inline def `config show`: typings.rcloneJs.rcloneJsStrings.`config show` = ("config show").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config show`]
    
    inline def `config update`: typings.rcloneJs.rcloneJsStrings.`config update` = ("config update").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config update`]
    
    inline def `config userinfo`: typings.rcloneJs.rcloneJsStrings.`config userinfo` = ("config userinfo").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`config userinfo`]
    
    inline def copy: typings.rcloneJs.rcloneJsStrings.copy = "copy".asInstanceOf[typings.rcloneJs.rcloneJsStrings.copy]
    
    inline def copyto: typings.rcloneJs.rcloneJsStrings.copyto = "copyto".asInstanceOf[typings.rcloneJs.rcloneJsStrings.copyto]
    
    inline def copyurl: typings.rcloneJs.rcloneJsStrings.copyurl = "copyurl".asInstanceOf[typings.rcloneJs.rcloneJsStrings.copyurl]
    
    inline def cryptcheck: typings.rcloneJs.rcloneJsStrings.cryptcheck = "cryptcheck".asInstanceOf[typings.rcloneJs.rcloneJsStrings.cryptcheck]
    
    inline def cryptdecode: typings.rcloneJs.rcloneJsStrings.cryptdecode = "cryptdecode".asInstanceOf[typings.rcloneJs.rcloneJsStrings.cryptdecode]
    
    inline def dedupe: typings.rcloneJs.rcloneJsStrings.dedupe = "dedupe".asInstanceOf[typings.rcloneJs.rcloneJsStrings.dedupe]
    
    inline def delete: typings.rcloneJs.rcloneJsStrings.delete = "delete".asInstanceOf[typings.rcloneJs.rcloneJsStrings.delete]
    
    inline def deletefile: typings.rcloneJs.rcloneJsStrings.deletefile = "deletefile".asInstanceOf[typings.rcloneJs.rcloneJsStrings.deletefile]
    
    inline def genautocomplete: typings.rcloneJs.rcloneJsStrings.genautocomplete = "genautocomplete".asInstanceOf[typings.rcloneJs.rcloneJsStrings.genautocomplete]
    
    inline def `genautocomplete bash`: typings.rcloneJs.rcloneJsStrings.`genautocomplete bash` = ("genautocomplete bash").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`genautocomplete bash`]
    
    inline def `genautocomplete fish`: typings.rcloneJs.rcloneJsStrings.`genautocomplete fish` = ("genautocomplete fish").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`genautocomplete fish`]
    
    inline def `genautocomplete zsh`: typings.rcloneJs.rcloneJsStrings.`genautocomplete zsh` = ("genautocomplete zsh").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`genautocomplete zsh`]
    
    inline def gendocs: typings.rcloneJs.rcloneJsStrings.gendocs = "gendocs".asInstanceOf[typings.rcloneJs.rcloneJsStrings.gendocs]
    
    inline def hashsum: typings.rcloneJs.rcloneJsStrings.hashsum = "hashsum".asInstanceOf[typings.rcloneJs.rcloneJsStrings.hashsum]
    
    inline def help: typings.rcloneJs.rcloneJsStrings.help = "help".asInstanceOf[typings.rcloneJs.rcloneJsStrings.help]
    
    inline def link: typings.rcloneJs.rcloneJsStrings.link = "link".asInstanceOf[typings.rcloneJs.rcloneJsStrings.link]
    
    inline def listremotes: typings.rcloneJs.rcloneJsStrings.listremotes = "listremotes".asInstanceOf[typings.rcloneJs.rcloneJsStrings.listremotes]
    
    inline def ls: typings.rcloneJs.rcloneJsStrings.ls = "ls".asInstanceOf[typings.rcloneJs.rcloneJsStrings.ls]
    
    inline def lsd: typings.rcloneJs.rcloneJsStrings.lsd = "lsd".asInstanceOf[typings.rcloneJs.rcloneJsStrings.lsd]
    
    inline def lsf: typings.rcloneJs.rcloneJsStrings.lsf = "lsf".asInstanceOf[typings.rcloneJs.rcloneJsStrings.lsf]
    
    inline def lsjson: typings.rcloneJs.rcloneJsStrings.lsjson = "lsjson".asInstanceOf[typings.rcloneJs.rcloneJsStrings.lsjson]
    
    inline def lsl: typings.rcloneJs.rcloneJsStrings.lsl = "lsl".asInstanceOf[typings.rcloneJs.rcloneJsStrings.lsl]
    
    inline def md5sum: typings.rcloneJs.rcloneJsStrings.md5sum = "md5sum".asInstanceOf[typings.rcloneJs.rcloneJsStrings.md5sum]
    
    inline def mkdir: typings.rcloneJs.rcloneJsStrings.mkdir = "mkdir".asInstanceOf[typings.rcloneJs.rcloneJsStrings.mkdir]
    
    inline def mount: typings.rcloneJs.rcloneJsStrings.mount = "mount".asInstanceOf[typings.rcloneJs.rcloneJsStrings.mount]
    
    inline def move: typings.rcloneJs.rcloneJsStrings.move = "move".asInstanceOf[typings.rcloneJs.rcloneJsStrings.move]
    
    inline def moveto: typings.rcloneJs.rcloneJsStrings.moveto = "moveto".asInstanceOf[typings.rcloneJs.rcloneJsStrings.moveto]
    
    inline def ncdu: typings.rcloneJs.rcloneJsStrings.ncdu = "ncdu".asInstanceOf[typings.rcloneJs.rcloneJsStrings.ncdu]
    
    inline def obscure: typings.rcloneJs.rcloneJsStrings.obscure = "obscure".asInstanceOf[typings.rcloneJs.rcloneJsStrings.obscure]
    
    inline def purge: typings.rcloneJs.rcloneJsStrings.purge = "purge".asInstanceOf[typings.rcloneJs.rcloneJsStrings.purge]
    
    inline def rc: typings.rcloneJs.rcloneJsStrings.rc = "rc".asInstanceOf[typings.rcloneJs.rcloneJsStrings.rc]
    
    inline def rcat: typings.rcloneJs.rcloneJsStrings.rcat = "rcat".asInstanceOf[typings.rcloneJs.rcloneJsStrings.rcat]
    
    inline def rcd: typings.rcloneJs.rcloneJsStrings.rcd = "rcd".asInstanceOf[typings.rcloneJs.rcloneJsStrings.rcd]
    
    inline def rmdir: typings.rcloneJs.rcloneJsStrings.rmdir = "rmdir".asInstanceOf[typings.rcloneJs.rcloneJsStrings.rmdir]
    
    inline def rmdirs: typings.rcloneJs.rcloneJsStrings.rmdirs = "rmdirs".asInstanceOf[typings.rcloneJs.rcloneJsStrings.rmdirs]
    
    inline def selfupdate: typings.rcloneJs.rcloneJsStrings.selfupdate = "selfupdate".asInstanceOf[typings.rcloneJs.rcloneJsStrings.selfupdate]
    
    inline def serve: typings.rcloneJs.rcloneJsStrings.serve = "serve".asInstanceOf[typings.rcloneJs.rcloneJsStrings.serve]
    
    inline def `serve dlna`: typings.rcloneJs.rcloneJsStrings.`serve dlna` = ("serve dlna").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`serve dlna`]
    
    inline def `serve ftp`: typings.rcloneJs.rcloneJsStrings.`serve ftp` = ("serve ftp").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`serve ftp`]
    
    inline def `serve http`: typings.rcloneJs.rcloneJsStrings.`serve http` = ("serve http").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`serve http`]
    
    inline def `serve restic`: typings.rcloneJs.rcloneJsStrings.`serve restic` = ("serve restic").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`serve restic`]
    
    inline def `serve sftp`: typings.rcloneJs.rcloneJsStrings.`serve sftp` = ("serve sftp").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`serve sftp`]
    
    inline def `serve webdav`: typings.rcloneJs.rcloneJsStrings.`serve webdav` = ("serve webdav").asInstanceOf[typings.rcloneJs.rcloneJsStrings.`serve webdav`]
    
    inline def settier: typings.rcloneJs.rcloneJsStrings.settier = "settier".asInstanceOf[typings.rcloneJs.rcloneJsStrings.settier]
    
    inline def sha1sum: typings.rcloneJs.rcloneJsStrings.sha1sum = "sha1sum".asInstanceOf[typings.rcloneJs.rcloneJsStrings.sha1sum]
    
    inline def size: typings.rcloneJs.rcloneJsStrings.size = "size".asInstanceOf[typings.rcloneJs.rcloneJsStrings.size]
    
    inline def sync: typings.rcloneJs.rcloneJsStrings.sync = "sync".asInstanceOf[typings.rcloneJs.rcloneJsStrings.sync]
    
    inline def test: typings.rcloneJs.rcloneJsStrings.test = "test".asInstanceOf[typings.rcloneJs.rcloneJsStrings.test]
    
    inline def touch: typings.rcloneJs.rcloneJsStrings.touch = "touch".asInstanceOf[typings.rcloneJs.rcloneJsStrings.touch]
    
    inline def tree: typings.rcloneJs.rcloneJsStrings.tree = "tree".asInstanceOf[typings.rcloneJs.rcloneJsStrings.tree]
    
    inline def version: typings.rcloneJs.rcloneJsStrings.version = "version".asInstanceOf[typings.rcloneJs.rcloneJsStrings.version]
  }
  
  @js.native
  trait FnStringOrObjectArgs[R] extends StObject {
    
    def apply(args: (String | js.Object)*): R = js.native
  }
  
  type PromisesFn = FnStringOrObjectArgs[js.Promise[Buffer]]
  
  type _To = ApiFn & RecordCommandApiFn & Promises
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ApiFn & RecordCommandApiFn & Promises = ^
}
