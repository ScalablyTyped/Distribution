package typings.rcloneJs

import typings.node.bufferMod.global.Buffer
import typings.node.nodeChildProcessMod.ChildProcess
import typings.rcloneJs.mod.ApiFn
import typings.rcloneJs.mod.PromisesFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Promises extends StObject {
    
    /** Promise-based API. */
    def promises(args: (String | js.Object)*): js.Promise[Buffer]
    /** Promise-based API. */
    @JSName("promises")
    var promises_Original: PromisesFn & RecordCommandPromisesFn
  }
  object Promises {
    
    inline def apply(promises: PromisesFn & RecordCommandPromisesFn): Promises = {
      val __obj = js.Dynamic.literal(promises = promises.asInstanceOf[js.Any])
      __obj.asInstanceOf[Promises]
    }
    
    extension [Self <: Promises](x: Self) {
      
      inline def setPromises(value: PromisesFn & RecordCommandPromisesFn): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<rclone.js.rclone.js.Command, rclone.js.rclone.js.ApiFn> */
  trait RecordCommandApiFn extends StObject {
    
    def about(args: (String | js.Object)*): ChildProcess
    @JSName("about")
    var about_Original: ApiFn
    
    def authorize(args: (String | js.Object)*): ChildProcess
    @JSName("authorize")
    var authorize_Original: ApiFn
    
    def backend(args: (String | js.Object)*): ChildProcess
    @JSName("backend")
    var backend_Original: ApiFn
    
    def cat(args: (String | js.Object)*): ChildProcess
    @JSName("cat")
    var cat_Original: ApiFn
    
    def check(args: (String | js.Object)*): ChildProcess
    @JSName("check")
    var check_Original: ApiFn
    
    def checksum(args: (String | js.Object)*): ChildProcess
    @JSName("checksum")
    var checksum_Original: ApiFn
    
    def cleanup(args: (String | js.Object)*): ChildProcess
    @JSName("cleanup")
    var cleanup_Original: ApiFn
    
    def config(args: (String | js.Object)*): ChildProcess
    
    def `config create`(args: (String | js.Object)*): ChildProcess
    @JSName("config create")
    var `config create_Original`: ApiFn
    
    def `config delete`(args: (String | js.Object)*): ChildProcess
    @JSName("config delete")
    var `config delete_Original`: ApiFn
    
    def `config disconnect`(args: (String | js.Object)*): ChildProcess
    @JSName("config disconnect")
    var `config disconnect_Original`: ApiFn
    
    def `config dump`(args: (String | js.Object)*): ChildProcess
    @JSName("config dump")
    var `config dump_Original`: ApiFn
    
    def `config edit`(args: (String | js.Object)*): ChildProcess
    @JSName("config edit")
    var `config edit_Original`: ApiFn
    
    def `config file`(args: (String | js.Object)*): ChildProcess
    @JSName("config file")
    var `config file_Original`: ApiFn
    
    def `config password`(args: (String | js.Object)*): ChildProcess
    @JSName("config password")
    var `config password_Original`: ApiFn
    
    def `config providers`(args: (String | js.Object)*): ChildProcess
    @JSName("config providers")
    var `config providers_Original`: ApiFn
    
    def `config reconnect`(args: (String | js.Object)*): ChildProcess
    @JSName("config reconnect")
    var `config reconnect_Original`: ApiFn
    
    def `config show`(args: (String | js.Object)*): ChildProcess
    @JSName("config show")
    var `config show_Original`: ApiFn
    
    def `config update`(args: (String | js.Object)*): ChildProcess
    @JSName("config update")
    var `config update_Original`: ApiFn
    
    def `config userinfo`(args: (String | js.Object)*): ChildProcess
    @JSName("config userinfo")
    var `config userinfo_Original`: ApiFn
    
    @JSName("config")
    var config_Original: ApiFn
    
    def copy(args: (String | js.Object)*): ChildProcess
    @JSName("copy")
    var copy_Original: ApiFn
    
    def copyto(args: (String | js.Object)*): ChildProcess
    @JSName("copyto")
    var copyto_Original: ApiFn
    
    def copyurl(args: (String | js.Object)*): ChildProcess
    @JSName("copyurl")
    var copyurl_Original: ApiFn
    
    def cryptcheck(args: (String | js.Object)*): ChildProcess
    @JSName("cryptcheck")
    var cryptcheck_Original: ApiFn
    
    def cryptdecode(args: (String | js.Object)*): ChildProcess
    @JSName("cryptdecode")
    var cryptdecode_Original: ApiFn
    
    def dedupe(args: (String | js.Object)*): ChildProcess
    @JSName("dedupe")
    var dedupe_Original: ApiFn
    
    def delete(args: (String | js.Object)*): ChildProcess
    @JSName("delete")
    var delete_Original: ApiFn
    
    def deletefile(args: (String | js.Object)*): ChildProcess
    @JSName("deletefile")
    var deletefile_Original: ApiFn
    
    def genautocomplete(args: (String | js.Object)*): ChildProcess
    
    def `genautocomplete bash`(args: (String | js.Object)*): ChildProcess
    @JSName("genautocomplete bash")
    var `genautocomplete bash_Original`: ApiFn
    
    def `genautocomplete fish`(args: (String | js.Object)*): ChildProcess
    @JSName("genautocomplete fish")
    var `genautocomplete fish_Original`: ApiFn
    
    def `genautocomplete zsh`(args: (String | js.Object)*): ChildProcess
    @JSName("genautocomplete zsh")
    var `genautocomplete zsh_Original`: ApiFn
    
    @JSName("genautocomplete")
    var genautocomplete_Original: ApiFn
    
    def gendocs(args: (String | js.Object)*): ChildProcess
    @JSName("gendocs")
    var gendocs_Original: ApiFn
    
    def hashsum(args: (String | js.Object)*): ChildProcess
    @JSName("hashsum")
    var hashsum_Original: ApiFn
    
    def help(args: (String | js.Object)*): ChildProcess
    @JSName("help")
    var help_Original: ApiFn
    
    def link(args: (String | js.Object)*): ChildProcess
    @JSName("link")
    var link_Original: ApiFn
    
    def listremotes(args: (String | js.Object)*): ChildProcess
    @JSName("listremotes")
    var listremotes_Original: ApiFn
    
    def ls(args: (String | js.Object)*): ChildProcess
    @JSName("ls")
    var ls_Original: ApiFn
    
    def lsd(args: (String | js.Object)*): ChildProcess
    @JSName("lsd")
    var lsd_Original: ApiFn
    
    def lsf(args: (String | js.Object)*): ChildProcess
    @JSName("lsf")
    var lsf_Original: ApiFn
    
    def lsjson(args: (String | js.Object)*): ChildProcess
    @JSName("lsjson")
    var lsjson_Original: ApiFn
    
    def lsl(args: (String | js.Object)*): ChildProcess
    @JSName("lsl")
    var lsl_Original: ApiFn
    
    def md5sum(args: (String | js.Object)*): ChildProcess
    @JSName("md5sum")
    var md5sum_Original: ApiFn
    
    def mkdir(args: (String | js.Object)*): ChildProcess
    @JSName("mkdir")
    var mkdir_Original: ApiFn
    
    def mount(args: (String | js.Object)*): ChildProcess
    @JSName("mount")
    var mount_Original: ApiFn
    
    def move(args: (String | js.Object)*): ChildProcess
    @JSName("move")
    var move_Original: ApiFn
    
    def moveto(args: (String | js.Object)*): ChildProcess
    @JSName("moveto")
    var moveto_Original: ApiFn
    
    def ncdu(args: (String | js.Object)*): ChildProcess
    @JSName("ncdu")
    var ncdu_Original: ApiFn
    
    def obscure(args: (String | js.Object)*): ChildProcess
    @JSName("obscure")
    var obscure_Original: ApiFn
    
    def purge(args: (String | js.Object)*): ChildProcess
    @JSName("purge")
    var purge_Original: ApiFn
    
    def rc(args: (String | js.Object)*): ChildProcess
    @JSName("rc")
    var rc_Original: ApiFn
    
    def rcat(args: (String | js.Object)*): ChildProcess
    @JSName("rcat")
    var rcat_Original: ApiFn
    
    def rcd(args: (String | js.Object)*): ChildProcess
    @JSName("rcd")
    var rcd_Original: ApiFn
    
    def rmdir(args: (String | js.Object)*): ChildProcess
    @JSName("rmdir")
    var rmdir_Original: ApiFn
    
    def rmdirs(args: (String | js.Object)*): ChildProcess
    @JSName("rmdirs")
    var rmdirs_Original: ApiFn
    
    def selfupdate(args: (String | js.Object)*): ChildProcess
    @JSName("selfupdate")
    var selfupdate_Original: ApiFn
    
    def serve(args: (String | js.Object)*): ChildProcess
    
    def `serve dlna`(args: (String | js.Object)*): ChildProcess
    @JSName("serve dlna")
    var `serve dlna_Original`: ApiFn
    
    def `serve ftp`(args: (String | js.Object)*): ChildProcess
    @JSName("serve ftp")
    var `serve ftp_Original`: ApiFn
    
    def `serve http`(args: (String | js.Object)*): ChildProcess
    @JSName("serve http")
    var `serve http_Original`: ApiFn
    
    def `serve restic`(args: (String | js.Object)*): ChildProcess
    @JSName("serve restic")
    var `serve restic_Original`: ApiFn
    
    def `serve sftp`(args: (String | js.Object)*): ChildProcess
    @JSName("serve sftp")
    var `serve sftp_Original`: ApiFn
    
    def `serve webdav`(args: (String | js.Object)*): ChildProcess
    @JSName("serve webdav")
    var `serve webdav_Original`: ApiFn
    
    @JSName("serve")
    var serve_Original: ApiFn
    
    def settier(args: (String | js.Object)*): ChildProcess
    @JSName("settier")
    var settier_Original: ApiFn
    
    def sha1sum(args: (String | js.Object)*): ChildProcess
    @JSName("sha1sum")
    var sha1sum_Original: ApiFn
    
    def size(args: (String | js.Object)*): ChildProcess
    @JSName("size")
    var size_Original: ApiFn
    
    def sync(args: (String | js.Object)*): ChildProcess
    @JSName("sync")
    var sync_Original: ApiFn
    
    def test(args: (String | js.Object)*): ChildProcess
    @JSName("test")
    var test_Original: ApiFn
    
    def touch(args: (String | js.Object)*): ChildProcess
    @JSName("touch")
    var touch_Original: ApiFn
    
    def tree(args: (String | js.Object)*): ChildProcess
    @JSName("tree")
    var tree_Original: ApiFn
    
    def version(args: (String | js.Object)*): ChildProcess
    @JSName("version")
    var version_Original: ApiFn
  }
  object RecordCommandApiFn {
    
    inline def apply(
      about: ApiFn,
      authorize: ApiFn,
      backend: ApiFn,
      cat: ApiFn,
      check: ApiFn,
      checksum: ApiFn,
      cleanup: ApiFn,
      config: ApiFn,
      `config create`: ApiFn,
      `config delete`: ApiFn,
      `config disconnect`: ApiFn,
      `config dump`: ApiFn,
      `config edit`: ApiFn,
      `config file`: ApiFn,
      `config password`: ApiFn,
      `config providers`: ApiFn,
      `config reconnect`: ApiFn,
      `config show`: ApiFn,
      `config update`: ApiFn,
      `config userinfo`: ApiFn,
      copy: ApiFn,
      copyto: ApiFn,
      copyurl: ApiFn,
      cryptcheck: ApiFn,
      cryptdecode: ApiFn,
      dedupe: ApiFn,
      delete: ApiFn,
      deletefile: ApiFn,
      genautocomplete: ApiFn,
      `genautocomplete bash`: ApiFn,
      `genautocomplete fish`: ApiFn,
      `genautocomplete zsh`: ApiFn,
      gendocs: ApiFn,
      hashsum: ApiFn,
      help: ApiFn,
      link: ApiFn,
      listremotes: ApiFn,
      ls: ApiFn,
      lsd: ApiFn,
      lsf: ApiFn,
      lsjson: ApiFn,
      lsl: ApiFn,
      md5sum: ApiFn,
      mkdir: ApiFn,
      mount: ApiFn,
      move: ApiFn,
      moveto: ApiFn,
      ncdu: ApiFn,
      obscure: ApiFn,
      purge: ApiFn,
      rc: ApiFn,
      rcat: ApiFn,
      rcd: ApiFn,
      rmdir: ApiFn,
      rmdirs: ApiFn,
      selfupdate: ApiFn,
      serve: ApiFn,
      `serve dlna`: ApiFn,
      `serve ftp`: ApiFn,
      `serve http`: ApiFn,
      `serve restic`: ApiFn,
      `serve sftp`: ApiFn,
      `serve webdav`: ApiFn,
      settier: ApiFn,
      sha1sum: ApiFn,
      size: ApiFn,
      sync: ApiFn,
      test: ApiFn,
      touch: ApiFn,
      tree: ApiFn,
      version: ApiFn
    ): RecordCommandApiFn = {
      val __obj = js.Dynamic.literal(about = about.asInstanceOf[js.Any], authorize = authorize.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], cat = cat.asInstanceOf[js.Any], check = check.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], cleanup = cleanup.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], copyto = copyto.asInstanceOf[js.Any], copyurl = copyurl.asInstanceOf[js.Any], cryptcheck = cryptcheck.asInstanceOf[js.Any], cryptdecode = cryptdecode.asInstanceOf[js.Any], dedupe = dedupe.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deletefile = deletefile.asInstanceOf[js.Any], genautocomplete = genautocomplete.asInstanceOf[js.Any], gendocs = gendocs.asInstanceOf[js.Any], hashsum = hashsum.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], listremotes = listremotes.asInstanceOf[js.Any], ls = ls.asInstanceOf[js.Any], lsd = lsd.asInstanceOf[js.Any], lsf = lsf.asInstanceOf[js.Any], lsjson = lsjson.asInstanceOf[js.Any], lsl = lsl.asInstanceOf[js.Any], md5sum = md5sum.asInstanceOf[js.Any], mkdir = mkdir.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], moveto = moveto.asInstanceOf[js.Any], ncdu = ncdu.asInstanceOf[js.Any], obscure = obscure.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any], rc = rc.asInstanceOf[js.Any], rcat = rcat.asInstanceOf[js.Any], rcd = rcd.asInstanceOf[js.Any], rmdir = rmdir.asInstanceOf[js.Any], rmdirs = rmdirs.asInstanceOf[js.Any], selfupdate = selfupdate.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any], settier = settier.asInstanceOf[js.Any], sha1sum = sha1sum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("config create")((`config create`).asInstanceOf[js.Any])
      __obj.updateDynamic("config delete")((`config delete`).asInstanceOf[js.Any])
      __obj.updateDynamic("config disconnect")((`config disconnect`).asInstanceOf[js.Any])
      __obj.updateDynamic("config dump")((`config dump`).asInstanceOf[js.Any])
      __obj.updateDynamic("config edit")((`config edit`).asInstanceOf[js.Any])
      __obj.updateDynamic("config file")((`config file`).asInstanceOf[js.Any])
      __obj.updateDynamic("config password")((`config password`).asInstanceOf[js.Any])
      __obj.updateDynamic("config providers")((`config providers`).asInstanceOf[js.Any])
      __obj.updateDynamic("config reconnect")((`config reconnect`).asInstanceOf[js.Any])
      __obj.updateDynamic("config show")((`config show`).asInstanceOf[js.Any])
      __obj.updateDynamic("config update")((`config update`).asInstanceOf[js.Any])
      __obj.updateDynamic("config userinfo")((`config userinfo`).asInstanceOf[js.Any])
      __obj.updateDynamic("genautocomplete bash")((`genautocomplete bash`).asInstanceOf[js.Any])
      __obj.updateDynamic("genautocomplete fish")((`genautocomplete fish`).asInstanceOf[js.Any])
      __obj.updateDynamic("genautocomplete zsh")((`genautocomplete zsh`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve dlna")((`serve dlna`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve ftp")((`serve ftp`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve http")((`serve http`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve restic")((`serve restic`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve sftp")((`serve sftp`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve webdav")((`serve webdav`).asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordCommandApiFn]
    }
    
    extension [Self <: RecordCommandApiFn](x: Self) {
      
      inline def setAbout(value: ApiFn): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAuthorize(value: ApiFn): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
      
      inline def setBackend(value: ApiFn): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setCat(value: ApiFn): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
      
      inline def setCheck(value: ApiFn): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setChecksum(value: ApiFn): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setCleanup(value: ApiFn): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: ApiFn): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def `setConfig create`(value: ApiFn): Self = StObject.set(x, "config create", value.asInstanceOf[js.Any])
      
      inline def `setConfig delete`(value: ApiFn): Self = StObject.set(x, "config delete", value.asInstanceOf[js.Any])
      
      inline def `setConfig disconnect`(value: ApiFn): Self = StObject.set(x, "config disconnect", value.asInstanceOf[js.Any])
      
      inline def `setConfig dump`(value: ApiFn): Self = StObject.set(x, "config dump", value.asInstanceOf[js.Any])
      
      inline def `setConfig edit`(value: ApiFn): Self = StObject.set(x, "config edit", value.asInstanceOf[js.Any])
      
      inline def `setConfig file`(value: ApiFn): Self = StObject.set(x, "config file", value.asInstanceOf[js.Any])
      
      inline def `setConfig password`(value: ApiFn): Self = StObject.set(x, "config password", value.asInstanceOf[js.Any])
      
      inline def `setConfig providers`(value: ApiFn): Self = StObject.set(x, "config providers", value.asInstanceOf[js.Any])
      
      inline def `setConfig reconnect`(value: ApiFn): Self = StObject.set(x, "config reconnect", value.asInstanceOf[js.Any])
      
      inline def `setConfig show`(value: ApiFn): Self = StObject.set(x, "config show", value.asInstanceOf[js.Any])
      
      inline def `setConfig update`(value: ApiFn): Self = StObject.set(x, "config update", value.asInstanceOf[js.Any])
      
      inline def `setConfig userinfo`(value: ApiFn): Self = StObject.set(x, "config userinfo", value.asInstanceOf[js.Any])
      
      inline def setCopy(value: ApiFn): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyto(value: ApiFn): Self = StObject.set(x, "copyto", value.asInstanceOf[js.Any])
      
      inline def setCopyurl(value: ApiFn): Self = StObject.set(x, "copyurl", value.asInstanceOf[js.Any])
      
      inline def setCryptcheck(value: ApiFn): Self = StObject.set(x, "cryptcheck", value.asInstanceOf[js.Any])
      
      inline def setCryptdecode(value: ApiFn): Self = StObject.set(x, "cryptdecode", value.asInstanceOf[js.Any])
      
      inline def setDedupe(value: ApiFn): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: ApiFn): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeletefile(value: ApiFn): Self = StObject.set(x, "deletefile", value.asInstanceOf[js.Any])
      
      inline def setGenautocomplete(value: ApiFn): Self = StObject.set(x, "genautocomplete", value.asInstanceOf[js.Any])
      
      inline def `setGenautocomplete bash`(value: ApiFn): Self = StObject.set(x, "genautocomplete bash", value.asInstanceOf[js.Any])
      
      inline def `setGenautocomplete fish`(value: ApiFn): Self = StObject.set(x, "genautocomplete fish", value.asInstanceOf[js.Any])
      
      inline def `setGenautocomplete zsh`(value: ApiFn): Self = StObject.set(x, "genautocomplete zsh", value.asInstanceOf[js.Any])
      
      inline def setGendocs(value: ApiFn): Self = StObject.set(x, "gendocs", value.asInstanceOf[js.Any])
      
      inline def setHashsum(value: ApiFn): Self = StObject.set(x, "hashsum", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: ApiFn): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setLink(value: ApiFn): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setListremotes(value: ApiFn): Self = StObject.set(x, "listremotes", value.asInstanceOf[js.Any])
      
      inline def setLs(value: ApiFn): Self = StObject.set(x, "ls", value.asInstanceOf[js.Any])
      
      inline def setLsd(value: ApiFn): Self = StObject.set(x, "lsd", value.asInstanceOf[js.Any])
      
      inline def setLsf(value: ApiFn): Self = StObject.set(x, "lsf", value.asInstanceOf[js.Any])
      
      inline def setLsjson(value: ApiFn): Self = StObject.set(x, "lsjson", value.asInstanceOf[js.Any])
      
      inline def setLsl(value: ApiFn): Self = StObject.set(x, "lsl", value.asInstanceOf[js.Any])
      
      inline def setMd5sum(value: ApiFn): Self = StObject.set(x, "md5sum", value.asInstanceOf[js.Any])
      
      inline def setMkdir(value: ApiFn): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
      
      inline def setMount(value: ApiFn): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setMove(value: ApiFn): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setMoveto(value: ApiFn): Self = StObject.set(x, "moveto", value.asInstanceOf[js.Any])
      
      inline def setNcdu(value: ApiFn): Self = StObject.set(x, "ncdu", value.asInstanceOf[js.Any])
      
      inline def setObscure(value: ApiFn): Self = StObject.set(x, "obscure", value.asInstanceOf[js.Any])
      
      inline def setPurge(value: ApiFn): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
      
      inline def setRc(value: ApiFn): Self = StObject.set(x, "rc", value.asInstanceOf[js.Any])
      
      inline def setRcat(value: ApiFn): Self = StObject.set(x, "rcat", value.asInstanceOf[js.Any])
      
      inline def setRcd(value: ApiFn): Self = StObject.set(x, "rcd", value.asInstanceOf[js.Any])
      
      inline def setRmdir(value: ApiFn): Self = StObject.set(x, "rmdir", value.asInstanceOf[js.Any])
      
      inline def setRmdirs(value: ApiFn): Self = StObject.set(x, "rmdirs", value.asInstanceOf[js.Any])
      
      inline def setSelfupdate(value: ApiFn): Self = StObject.set(x, "selfupdate", value.asInstanceOf[js.Any])
      
      inline def setServe(value: ApiFn): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
      
      inline def `setServe dlna`(value: ApiFn): Self = StObject.set(x, "serve dlna", value.asInstanceOf[js.Any])
      
      inline def `setServe ftp`(value: ApiFn): Self = StObject.set(x, "serve ftp", value.asInstanceOf[js.Any])
      
      inline def `setServe http`(value: ApiFn): Self = StObject.set(x, "serve http", value.asInstanceOf[js.Any])
      
      inline def `setServe restic`(value: ApiFn): Self = StObject.set(x, "serve restic", value.asInstanceOf[js.Any])
      
      inline def `setServe sftp`(value: ApiFn): Self = StObject.set(x, "serve sftp", value.asInstanceOf[js.Any])
      
      inline def `setServe webdav`(value: ApiFn): Self = StObject.set(x, "serve webdav", value.asInstanceOf[js.Any])
      
      inline def setSettier(value: ApiFn): Self = StObject.set(x, "settier", value.asInstanceOf[js.Any])
      
      inline def setSha1sum(value: ApiFn): Self = StObject.set(x, "sha1sum", value.asInstanceOf[js.Any])
      
      inline def setSize(value: ApiFn): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSync(value: ApiFn): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setTest(value: ApiFn): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTouch(value: ApiFn): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTree(value: ApiFn): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: ApiFn): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<rclone.js.rclone.js.Command, rclone.js.rclone.js.PromisesFn> */
  trait RecordCommandPromisesFn extends StObject {
    
    def about(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("about")
    var about_Original: PromisesFn
    
    def authorize(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("authorize")
    var authorize_Original: PromisesFn
    
    def backend(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("backend")
    var backend_Original: PromisesFn
    
    def cat(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("cat")
    var cat_Original: PromisesFn
    
    def check(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("check")
    var check_Original: PromisesFn
    
    def checksum(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("checksum")
    var checksum_Original: PromisesFn
    
    def cleanup(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("cleanup")
    var cleanup_Original: PromisesFn
    
    def config(args: (String | js.Object)*): js.Promise[Buffer]
    
    def `config create`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config create")
    var `config create_Original`: PromisesFn
    
    def `config delete`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config delete")
    var `config delete_Original`: PromisesFn
    
    def `config disconnect`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config disconnect")
    var `config disconnect_Original`: PromisesFn
    
    def `config dump`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config dump")
    var `config dump_Original`: PromisesFn
    
    def `config edit`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config edit")
    var `config edit_Original`: PromisesFn
    
    def `config file`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config file")
    var `config file_Original`: PromisesFn
    
    def `config password`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config password")
    var `config password_Original`: PromisesFn
    
    def `config providers`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config providers")
    var `config providers_Original`: PromisesFn
    
    def `config reconnect`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config reconnect")
    var `config reconnect_Original`: PromisesFn
    
    def `config show`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config show")
    var `config show_Original`: PromisesFn
    
    def `config update`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config update")
    var `config update_Original`: PromisesFn
    
    def `config userinfo`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("config userinfo")
    var `config userinfo_Original`: PromisesFn
    
    @JSName("config")
    var config_Original: PromisesFn
    
    def copy(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("copy")
    var copy_Original: PromisesFn
    
    def copyto(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("copyto")
    var copyto_Original: PromisesFn
    
    def copyurl(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("copyurl")
    var copyurl_Original: PromisesFn
    
    def cryptcheck(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("cryptcheck")
    var cryptcheck_Original: PromisesFn
    
    def cryptdecode(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("cryptdecode")
    var cryptdecode_Original: PromisesFn
    
    def dedupe(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("dedupe")
    var dedupe_Original: PromisesFn
    
    def delete(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("delete")
    var delete_Original: PromisesFn
    
    def deletefile(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("deletefile")
    var deletefile_Original: PromisesFn
    
    def genautocomplete(args: (String | js.Object)*): js.Promise[Buffer]
    
    def `genautocomplete bash`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("genautocomplete bash")
    var `genautocomplete bash_Original`: PromisesFn
    
    def `genautocomplete fish`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("genautocomplete fish")
    var `genautocomplete fish_Original`: PromisesFn
    
    def `genautocomplete zsh`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("genautocomplete zsh")
    var `genautocomplete zsh_Original`: PromisesFn
    
    @JSName("genautocomplete")
    var genautocomplete_Original: PromisesFn
    
    def gendocs(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("gendocs")
    var gendocs_Original: PromisesFn
    
    def hashsum(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("hashsum")
    var hashsum_Original: PromisesFn
    
    def help(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("help")
    var help_Original: PromisesFn
    
    def link(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("link")
    var link_Original: PromisesFn
    
    def listremotes(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("listremotes")
    var listremotes_Original: PromisesFn
    
    def ls(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("ls")
    var ls_Original: PromisesFn
    
    def lsd(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("lsd")
    var lsd_Original: PromisesFn
    
    def lsf(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("lsf")
    var lsf_Original: PromisesFn
    
    def lsjson(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("lsjson")
    var lsjson_Original: PromisesFn
    
    def lsl(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("lsl")
    var lsl_Original: PromisesFn
    
    def md5sum(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("md5sum")
    var md5sum_Original: PromisesFn
    
    def mkdir(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("mkdir")
    var mkdir_Original: PromisesFn
    
    def mount(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("mount")
    var mount_Original: PromisesFn
    
    def move(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("move")
    var move_Original: PromisesFn
    
    def moveto(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("moveto")
    var moveto_Original: PromisesFn
    
    def ncdu(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("ncdu")
    var ncdu_Original: PromisesFn
    
    def obscure(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("obscure")
    var obscure_Original: PromisesFn
    
    def purge(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("purge")
    var purge_Original: PromisesFn
    
    def rc(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("rc")
    var rc_Original: PromisesFn
    
    def rcat(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("rcat")
    var rcat_Original: PromisesFn
    
    def rcd(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("rcd")
    var rcd_Original: PromisesFn
    
    def rmdir(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("rmdir")
    var rmdir_Original: PromisesFn
    
    def rmdirs(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("rmdirs")
    var rmdirs_Original: PromisesFn
    
    def selfupdate(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("selfupdate")
    var selfupdate_Original: PromisesFn
    
    def serve(args: (String | js.Object)*): js.Promise[Buffer]
    
    def `serve dlna`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("serve dlna")
    var `serve dlna_Original`: PromisesFn
    
    def `serve ftp`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("serve ftp")
    var `serve ftp_Original`: PromisesFn
    
    def `serve http`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("serve http")
    var `serve http_Original`: PromisesFn
    
    def `serve restic`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("serve restic")
    var `serve restic_Original`: PromisesFn
    
    def `serve sftp`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("serve sftp")
    var `serve sftp_Original`: PromisesFn
    
    def `serve webdav`(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("serve webdav")
    var `serve webdav_Original`: PromisesFn
    
    @JSName("serve")
    var serve_Original: PromisesFn
    
    def settier(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("settier")
    var settier_Original: PromisesFn
    
    def sha1sum(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("sha1sum")
    var sha1sum_Original: PromisesFn
    
    def size(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("size")
    var size_Original: PromisesFn
    
    def sync(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("sync")
    var sync_Original: PromisesFn
    
    def test(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("test")
    var test_Original: PromisesFn
    
    def touch(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("touch")
    var touch_Original: PromisesFn
    
    def tree(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("tree")
    var tree_Original: PromisesFn
    
    def version(args: (String | js.Object)*): js.Promise[Buffer]
    @JSName("version")
    var version_Original: PromisesFn
  }
  object RecordCommandPromisesFn {
    
    inline def apply(
      about: PromisesFn,
      authorize: PromisesFn,
      backend: PromisesFn,
      cat: PromisesFn,
      check: PromisesFn,
      checksum: PromisesFn,
      cleanup: PromisesFn,
      config: PromisesFn,
      `config create`: PromisesFn,
      `config delete`: PromisesFn,
      `config disconnect`: PromisesFn,
      `config dump`: PromisesFn,
      `config edit`: PromisesFn,
      `config file`: PromisesFn,
      `config password`: PromisesFn,
      `config providers`: PromisesFn,
      `config reconnect`: PromisesFn,
      `config show`: PromisesFn,
      `config update`: PromisesFn,
      `config userinfo`: PromisesFn,
      copy: PromisesFn,
      copyto: PromisesFn,
      copyurl: PromisesFn,
      cryptcheck: PromisesFn,
      cryptdecode: PromisesFn,
      dedupe: PromisesFn,
      delete: PromisesFn,
      deletefile: PromisesFn,
      genautocomplete: PromisesFn,
      `genautocomplete bash`: PromisesFn,
      `genautocomplete fish`: PromisesFn,
      `genautocomplete zsh`: PromisesFn,
      gendocs: PromisesFn,
      hashsum: PromisesFn,
      help: PromisesFn,
      link: PromisesFn,
      listremotes: PromisesFn,
      ls: PromisesFn,
      lsd: PromisesFn,
      lsf: PromisesFn,
      lsjson: PromisesFn,
      lsl: PromisesFn,
      md5sum: PromisesFn,
      mkdir: PromisesFn,
      mount: PromisesFn,
      move: PromisesFn,
      moveto: PromisesFn,
      ncdu: PromisesFn,
      obscure: PromisesFn,
      purge: PromisesFn,
      rc: PromisesFn,
      rcat: PromisesFn,
      rcd: PromisesFn,
      rmdir: PromisesFn,
      rmdirs: PromisesFn,
      selfupdate: PromisesFn,
      serve: PromisesFn,
      `serve dlna`: PromisesFn,
      `serve ftp`: PromisesFn,
      `serve http`: PromisesFn,
      `serve restic`: PromisesFn,
      `serve sftp`: PromisesFn,
      `serve webdav`: PromisesFn,
      settier: PromisesFn,
      sha1sum: PromisesFn,
      size: PromisesFn,
      sync: PromisesFn,
      test: PromisesFn,
      touch: PromisesFn,
      tree: PromisesFn,
      version: PromisesFn
    ): RecordCommandPromisesFn = {
      val __obj = js.Dynamic.literal(about = about.asInstanceOf[js.Any], authorize = authorize.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], cat = cat.asInstanceOf[js.Any], check = check.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], cleanup = cleanup.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], copyto = copyto.asInstanceOf[js.Any], copyurl = copyurl.asInstanceOf[js.Any], cryptcheck = cryptcheck.asInstanceOf[js.Any], cryptdecode = cryptdecode.asInstanceOf[js.Any], dedupe = dedupe.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deletefile = deletefile.asInstanceOf[js.Any], genautocomplete = genautocomplete.asInstanceOf[js.Any], gendocs = gendocs.asInstanceOf[js.Any], hashsum = hashsum.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], listremotes = listremotes.asInstanceOf[js.Any], ls = ls.asInstanceOf[js.Any], lsd = lsd.asInstanceOf[js.Any], lsf = lsf.asInstanceOf[js.Any], lsjson = lsjson.asInstanceOf[js.Any], lsl = lsl.asInstanceOf[js.Any], md5sum = md5sum.asInstanceOf[js.Any], mkdir = mkdir.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], moveto = moveto.asInstanceOf[js.Any], ncdu = ncdu.asInstanceOf[js.Any], obscure = obscure.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any], rc = rc.asInstanceOf[js.Any], rcat = rcat.asInstanceOf[js.Any], rcd = rcd.asInstanceOf[js.Any], rmdir = rmdir.asInstanceOf[js.Any], rmdirs = rmdirs.asInstanceOf[js.Any], selfupdate = selfupdate.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any], settier = settier.asInstanceOf[js.Any], sha1sum = sha1sum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("config create")((`config create`).asInstanceOf[js.Any])
      __obj.updateDynamic("config delete")((`config delete`).asInstanceOf[js.Any])
      __obj.updateDynamic("config disconnect")((`config disconnect`).asInstanceOf[js.Any])
      __obj.updateDynamic("config dump")((`config dump`).asInstanceOf[js.Any])
      __obj.updateDynamic("config edit")((`config edit`).asInstanceOf[js.Any])
      __obj.updateDynamic("config file")((`config file`).asInstanceOf[js.Any])
      __obj.updateDynamic("config password")((`config password`).asInstanceOf[js.Any])
      __obj.updateDynamic("config providers")((`config providers`).asInstanceOf[js.Any])
      __obj.updateDynamic("config reconnect")((`config reconnect`).asInstanceOf[js.Any])
      __obj.updateDynamic("config show")((`config show`).asInstanceOf[js.Any])
      __obj.updateDynamic("config update")((`config update`).asInstanceOf[js.Any])
      __obj.updateDynamic("config userinfo")((`config userinfo`).asInstanceOf[js.Any])
      __obj.updateDynamic("genautocomplete bash")((`genautocomplete bash`).asInstanceOf[js.Any])
      __obj.updateDynamic("genautocomplete fish")((`genautocomplete fish`).asInstanceOf[js.Any])
      __obj.updateDynamic("genautocomplete zsh")((`genautocomplete zsh`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve dlna")((`serve dlna`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve ftp")((`serve ftp`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve http")((`serve http`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve restic")((`serve restic`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve sftp")((`serve sftp`).asInstanceOf[js.Any])
      __obj.updateDynamic("serve webdav")((`serve webdav`).asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordCommandPromisesFn]
    }
    
    extension [Self <: RecordCommandPromisesFn](x: Self) {
      
      inline def setAbout(value: PromisesFn): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAuthorize(value: PromisesFn): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
      
      inline def setBackend(value: PromisesFn): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setCat(value: PromisesFn): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
      
      inline def setCheck(value: PromisesFn): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setChecksum(value: PromisesFn): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setCleanup(value: PromisesFn): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: PromisesFn): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def `setConfig create`(value: PromisesFn): Self = StObject.set(x, "config create", value.asInstanceOf[js.Any])
      
      inline def `setConfig delete`(value: PromisesFn): Self = StObject.set(x, "config delete", value.asInstanceOf[js.Any])
      
      inline def `setConfig disconnect`(value: PromisesFn): Self = StObject.set(x, "config disconnect", value.asInstanceOf[js.Any])
      
      inline def `setConfig dump`(value: PromisesFn): Self = StObject.set(x, "config dump", value.asInstanceOf[js.Any])
      
      inline def `setConfig edit`(value: PromisesFn): Self = StObject.set(x, "config edit", value.asInstanceOf[js.Any])
      
      inline def `setConfig file`(value: PromisesFn): Self = StObject.set(x, "config file", value.asInstanceOf[js.Any])
      
      inline def `setConfig password`(value: PromisesFn): Self = StObject.set(x, "config password", value.asInstanceOf[js.Any])
      
      inline def `setConfig providers`(value: PromisesFn): Self = StObject.set(x, "config providers", value.asInstanceOf[js.Any])
      
      inline def `setConfig reconnect`(value: PromisesFn): Self = StObject.set(x, "config reconnect", value.asInstanceOf[js.Any])
      
      inline def `setConfig show`(value: PromisesFn): Self = StObject.set(x, "config show", value.asInstanceOf[js.Any])
      
      inline def `setConfig update`(value: PromisesFn): Self = StObject.set(x, "config update", value.asInstanceOf[js.Any])
      
      inline def `setConfig userinfo`(value: PromisesFn): Self = StObject.set(x, "config userinfo", value.asInstanceOf[js.Any])
      
      inline def setCopy(value: PromisesFn): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyto(value: PromisesFn): Self = StObject.set(x, "copyto", value.asInstanceOf[js.Any])
      
      inline def setCopyurl(value: PromisesFn): Self = StObject.set(x, "copyurl", value.asInstanceOf[js.Any])
      
      inline def setCryptcheck(value: PromisesFn): Self = StObject.set(x, "cryptcheck", value.asInstanceOf[js.Any])
      
      inline def setCryptdecode(value: PromisesFn): Self = StObject.set(x, "cryptdecode", value.asInstanceOf[js.Any])
      
      inline def setDedupe(value: PromisesFn): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: PromisesFn): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeletefile(value: PromisesFn): Self = StObject.set(x, "deletefile", value.asInstanceOf[js.Any])
      
      inline def setGenautocomplete(value: PromisesFn): Self = StObject.set(x, "genautocomplete", value.asInstanceOf[js.Any])
      
      inline def `setGenautocomplete bash`(value: PromisesFn): Self = StObject.set(x, "genautocomplete bash", value.asInstanceOf[js.Any])
      
      inline def `setGenautocomplete fish`(value: PromisesFn): Self = StObject.set(x, "genautocomplete fish", value.asInstanceOf[js.Any])
      
      inline def `setGenautocomplete zsh`(value: PromisesFn): Self = StObject.set(x, "genautocomplete zsh", value.asInstanceOf[js.Any])
      
      inline def setGendocs(value: PromisesFn): Self = StObject.set(x, "gendocs", value.asInstanceOf[js.Any])
      
      inline def setHashsum(value: PromisesFn): Self = StObject.set(x, "hashsum", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: PromisesFn): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setLink(value: PromisesFn): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setListremotes(value: PromisesFn): Self = StObject.set(x, "listremotes", value.asInstanceOf[js.Any])
      
      inline def setLs(value: PromisesFn): Self = StObject.set(x, "ls", value.asInstanceOf[js.Any])
      
      inline def setLsd(value: PromisesFn): Self = StObject.set(x, "lsd", value.asInstanceOf[js.Any])
      
      inline def setLsf(value: PromisesFn): Self = StObject.set(x, "lsf", value.asInstanceOf[js.Any])
      
      inline def setLsjson(value: PromisesFn): Self = StObject.set(x, "lsjson", value.asInstanceOf[js.Any])
      
      inline def setLsl(value: PromisesFn): Self = StObject.set(x, "lsl", value.asInstanceOf[js.Any])
      
      inline def setMd5sum(value: PromisesFn): Self = StObject.set(x, "md5sum", value.asInstanceOf[js.Any])
      
      inline def setMkdir(value: PromisesFn): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
      
      inline def setMount(value: PromisesFn): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setMove(value: PromisesFn): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setMoveto(value: PromisesFn): Self = StObject.set(x, "moveto", value.asInstanceOf[js.Any])
      
      inline def setNcdu(value: PromisesFn): Self = StObject.set(x, "ncdu", value.asInstanceOf[js.Any])
      
      inline def setObscure(value: PromisesFn): Self = StObject.set(x, "obscure", value.asInstanceOf[js.Any])
      
      inline def setPurge(value: PromisesFn): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
      
      inline def setRc(value: PromisesFn): Self = StObject.set(x, "rc", value.asInstanceOf[js.Any])
      
      inline def setRcat(value: PromisesFn): Self = StObject.set(x, "rcat", value.asInstanceOf[js.Any])
      
      inline def setRcd(value: PromisesFn): Self = StObject.set(x, "rcd", value.asInstanceOf[js.Any])
      
      inline def setRmdir(value: PromisesFn): Self = StObject.set(x, "rmdir", value.asInstanceOf[js.Any])
      
      inline def setRmdirs(value: PromisesFn): Self = StObject.set(x, "rmdirs", value.asInstanceOf[js.Any])
      
      inline def setSelfupdate(value: PromisesFn): Self = StObject.set(x, "selfupdate", value.asInstanceOf[js.Any])
      
      inline def setServe(value: PromisesFn): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
      
      inline def `setServe dlna`(value: PromisesFn): Self = StObject.set(x, "serve dlna", value.asInstanceOf[js.Any])
      
      inline def `setServe ftp`(value: PromisesFn): Self = StObject.set(x, "serve ftp", value.asInstanceOf[js.Any])
      
      inline def `setServe http`(value: PromisesFn): Self = StObject.set(x, "serve http", value.asInstanceOf[js.Any])
      
      inline def `setServe restic`(value: PromisesFn): Self = StObject.set(x, "serve restic", value.asInstanceOf[js.Any])
      
      inline def `setServe sftp`(value: PromisesFn): Self = StObject.set(x, "serve sftp", value.asInstanceOf[js.Any])
      
      inline def `setServe webdav`(value: PromisesFn): Self = StObject.set(x, "serve webdav", value.asInstanceOf[js.Any])
      
      inline def setSettier(value: PromisesFn): Self = StObject.set(x, "settier", value.asInstanceOf[js.Any])
      
      inline def setSha1sum(value: PromisesFn): Self = StObject.set(x, "sha1sum", value.asInstanceOf[js.Any])
      
      inline def setSize(value: PromisesFn): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSync(value: PromisesFn): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setTest(value: PromisesFn): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTouch(value: PromisesFn): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTree(value: PromisesFn): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: PromisesFn): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
