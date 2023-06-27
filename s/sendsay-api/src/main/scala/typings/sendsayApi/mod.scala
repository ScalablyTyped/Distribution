package typings.sendsayApi

import org.scalablytyped.runtime.StringDictionary
import typings.sendsayApi.anon.Login
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sendsay-api", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Sendsay {
    def this(options: SendsayOptionsApiKey) = this()
    def this(options: SendsayOptionsAuth) = this()
  }
  
  trait BaseSendsayOptions extends StObject {
    
    /**
      * Default: https://api.sendsay.ru
      */
    var apiUrl: js.UndefOr[String] = js.undefined
  }
  object BaseSendsayOptions {
    
    inline def apply(): BaseSendsayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseSendsayOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseSendsayOptions] (val x: Self) extends AnyVal {
      
      inline def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
      
      inline def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sendsayApi.sendsayApiStrings.ping
    - typings.sendsayApi.sendsayApiStrings.pong
    - typings.sendsayApi.sendsayApiStrings.xxx
    - typings.sendsayApi.sendsayApiStrings.login
    - typings.sendsayApi.sendsayApiStrings.loginDotagsesDotchallenge
    - typings.sendsayApi.sendsayApiStrings.memberDotimport
    - typings.sendsayApi.sendsayApiStrings.memberDotexists
    - typings.sendsayApi.sendsayApiStrings.memberDotupdate
    - typings.sendsayApi.sendsayApiStrings.memberDotfind
    - typings.sendsayApi.sendsayApiStrings.memberDotget
    - typings.sendsayApi.sendsayApiStrings.memberDotset
    - typings.sendsayApi.sendsayApiStrings.memberDotdelete
    - typings.sendsayApi.sendsayApiStrings.memberDotmerge
    - typings.sendsayApi.sendsayApiStrings.memberDotheadDotlist
    - typings.sendsayApi.sendsayApiStrings.memberDotheadDotattach
    - typings.sendsayApi.sendsayApiStrings.memberDotheadDotdetach
    - typings.sendsayApi.sendsayApiStrings.memberDotheadDotreplace
    - typings.sendsayApi.sendsayApiStrings.memberDotwhere
    - typings.sendsayApi.sendsayApiStrings.memberDotlist
    - typings.sendsayApi.sendsayApiStrings.memberDotlistDotcount
    - typings.sendsayApi.sendsayApiStrings.memberDotimportDotprobe
    - typings.sendsayApi.sendsayApiStrings.memberDotsendconfirm
    - typings.sendsayApi.sendsayApiStrings.batch
    - typings.sendsayApi.sendsayApiStrings.logout
    - typings.sendsayApi.sendsayApiStrings.trackDotlist
    - typings.sendsayApi.sendsayApiStrings.trackDotget
    - typings.sendsayApi.sendsayApiStrings.emailDotget
    - typings.sendsayApi.sendsayApiStrings.emailDottest
    - typings.sendsayApi.sendsayApiStrings.emailDotcleanerror
    - typings.sendsayApi.sendsayApiStrings.groupDotlist
    - typings.sendsayApi.sendsayApiStrings.groupDotcreate
    - typings.sendsayApi.sendsayApiStrings.groupDotget
    - typings.sendsayApi.sendsayApiStrings.groupDotset
    - typings.sendsayApi.sendsayApiStrings.groupDotdelete
    - typings.sendsayApi.sendsayApiStrings.groupDotfilterDotset
    - typings.sendsayApi.sendsayApiStrings.groupDotfilterDotmatch
    - typings.sendsayApi.sendsayApiStrings.groupDotsnapshot
    - typings.sendsayApi.sendsayApiStrings.groupDotclean
    - typings.sendsayApi.sendsayApiStrings.anketaDotlist
    - typings.sendsayApi.sendsayApiStrings.anketaDotget
    - typings.sendsayApi.sendsayApiStrings.anketaDotdelete
    - typings.sendsayApi.sendsayApiStrings.anketaDotcreate
    - typings.sendsayApi.sendsayApiStrings.anketaDotset
    - typings.sendsayApi.sendsayApiStrings.anketaDotquestDotadd
    - typings.sendsayApi.sendsayApiStrings.anketaDotquestDotset
    - typings.sendsayApi.sendsayApiStrings.anketaDotquestDotdelete
    - typings.sendsayApi.sendsayApiStrings.anketaDotquestDotorder
    - typings.sendsayApi.sendsayApiStrings.anketaDotquestDotresponseDotdelete
    - typings.sendsayApi.sendsayApiStrings.anketaDotquestDotresponseDotorder
    - typings.sendsayApi.sendsayApiStrings.issueDotsend
    - typings.sendsayApi.sendsayApiStrings.issueDotsendDottest
    - typings.sendsayApi.sendsayApiStrings.issueDotlaterDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotsendDotmulti
    - typings.sendsayApi.sendsayApiStrings.issueDotlaterDotget
    - typings.sendsayApi.sendsayApiStrings.issueDotlaterDotsend
    - typings.sendsayApi.sendsayApiStrings.issueDotlaterDotset
    - typings.sendsayApi.sendsayApiStrings.issueDotlaterDotdelete
    - typings.sendsayApi.sendsayApiStrings.issueDotrunningDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotrunningDotpause
    - typings.sendsayApi.sendsayApiStrings.issueDotrunningDotresume
    - typings.sendsayApi.sendsayApiStrings.issueDotrunningDotstart
    - typings.sendsayApi.sendsayApiStrings.issueDotrunningDotdelete
    - typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotget
    - typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotset
    - typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotdelete
    - typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotget
    - typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotset
    - typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotdelete
    - typings.sendsayApi.sendsayApiStrings.issueDotmultiDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotmultiDotget
    - typings.sendsayApi.sendsayApiStrings.issueDotdraftDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotdraftDotget
    - typings.sendsayApi.sendsayApiStrings.issueDotdraftDotset
    - typings.sendsayApi.sendsayApiStrings.issueDotdraftDotdelete
    - typings.sendsayApi.sendsayApiStrings.issueDotdraftDotpreview
    - typings.sendsayApi.sendsayApiStrings.issueDotclassDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotclassDotget
    - typings.sendsayApi.sendsayApiStrings.issueDotclassDotdelete
    - typings.sendsayApi.sendsayApiStrings.issueDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotget
    - typings.sendsayApi.sendsayApiStrings.issueDotgetDotattach
    - typings.sendsayApi.sendsayApiStrings.issueDotdkimDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotdkimDotget
    - typings.sendsayApi.sendsayApiStrings.issueDotdkimDotcreate
    - typings.sendsayApi.sendsayApiStrings.issueDotdkimDotdelete
    - typings.sendsayApi.sendsayApiStrings.issueDotdkimDotcheck
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotcreate
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotget
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotset
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotdelete
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotwinner
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotlist
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotcreate
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotset
    - typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotdelete
    - typings.sendsayApi.sendsayApiStrings.statDotuni
    - typings.sendsayApi.sendsayApiStrings.stoplistDotget
    - typings.sendsayApi.sendsayApiStrings.stoplistDotadd
    - typings.sendsayApi.sendsayApiStrings.stoplistDotdelete
    - typings.sendsayApi.sendsayApiStrings.stoplistDoterase
    - typings.sendsayApi.sendsayApiStrings.cronDotlist
    - typings.sendsayApi.sendsayApiStrings.cronDotget
    - typings.sendsayApi.sendsayApiStrings.cronDotcreate
    - typings.sendsayApi.sendsayApiStrings.cronDotset
    - typings.sendsayApi.sendsayApiStrings.cronDotdelete
    - typings.sendsayApi.sendsayApiStrings.cronDotrunonce
    - typings.sendsayApi.sendsayApiStrings.sequenceDotlist
    - typings.sendsayApi.sendsayApiStrings.sequenceDotcreate
    - typings.sendsayApi.sendsayApiStrings.sequenceDotget
    - typings.sendsayApi.sendsayApiStrings.sequenceDotset
    - typings.sendsayApi.sendsayApiStrings.sequenceDotdelete
    - typings.sendsayApi.sendsayApiStrings.sequenceDotstepsDotget
    - typings.sendsayApi.sendsayApiStrings.sequenceDotstepsDotset
    - typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotstart
    - typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotpause
    - typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotresume
    - typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotstop
    - typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotmembership
    - typings.sendsayApi.sendsayApiStrings.formDotlist
    - typings.sendsayApi.sendsayApiStrings.formDotget
    - typings.sendsayApi.sendsayApiStrings.formDotset
    - typings.sendsayApi.sendsayApiStrings.formDotdelete
    - typings.sendsayApi.sendsayApiStrings.formDotsource
    - typings.sendsayApi.sendsayApiStrings.formDottransfer
    - typings.sendsayApi.sendsayApiStrings.rfsDotlist
    - typings.sendsayApi.sendsayApiStrings.rfsDotrename
    - typings.sendsayApi.sendsayApiStrings.rfsDotfileDotget
    - typings.sendsayApi.sendsayApiStrings.rfsDotfileDotput
    - typings.sendsayApi.sendsayApiStrings.rfsDotfileDotdelete
    - typings.sendsayApi.sendsayApiStrings.rfsDotdirDotmake
    - typings.sendsayApi.sendsayApiStrings.rfsDotdirDotdelete
    - typings.sendsayApi.sendsayApiStrings.campaignDotlist
    - typings.sendsayApi.sendsayApiStrings.campaignDotget
    - typings.sendsayApi.sendsayApiStrings.campaignDotset
    - typings.sendsayApi.sendsayApiStrings.campaignDotdelete
    - typings.sendsayApi.sendsayApiStrings.campaignDotmemberDotlist
    - typings.sendsayApi.sendsayApiStrings.campaignDotmemberDotadd
    - typings.sendsayApi.sendsayApiStrings.campaignDotmemberDotdelete
    - typings.sendsayApi.sendsayApiStrings.datarowDotlist
    - typings.sendsayApi.sendsayApiStrings.datarowDotget
    - typings.sendsayApi.sendsayApiStrings.datarowDotcreate
    - typings.sendsayApi.sendsayApiStrings.datarowDotset
    - typings.sendsayApi.sendsayApiStrings.datarowDotdelete
    - typings.sendsayApi.sendsayApiStrings.datarowDotload
    - typings.sendsayApi.sendsayApiStrings.datarowDotclean
    - typings.sendsayApi.sendsayApiStrings.lentaDotlist
    - typings.sendsayApi.sendsayApiStrings.lentaDotget
    - typings.sendsayApi.sendsayApiStrings.lentaDotset
    - typings.sendsayApi.sendsayApiStrings.lentaDotdelete
    - typings.sendsayApi.sendsayApiStrings.lentaDotsourceDotdelete
    - typings.sendsayApi.sendsayApiStrings.lentaDotsourceDotrefresh
    - typings.sendsayApi.sendsayApiStrings.lentaDotsend
    - typings.sendsayApi.sendsayApiStrings.infolettDotlist
    - typings.sendsayApi.sendsayApiStrings.infolettDotget
    - typings.sendsayApi.sendsayApiStrings.infolettDotset
    - typings.sendsayApi.sendsayApiStrings.infolettDotdelete
    - typings.sendsayApi.sendsayApiStrings.infolettDotpreview
    - typings.sendsayApi.sendsayApiStrings.formatDotlist
    - typings.sendsayApi.sendsayApiStrings.formatDotget
    - typings.sendsayApi.sendsayApiStrings.formatDotset
    - typings.sendsayApi.sendsayApiStrings.formatDotdelete
    - typings.sendsayApi.sendsayApiStrings.linkDotlist
    - typings.sendsayApi.sendsayApiStrings.linkDotget
    - typings.sendsayApi.sendsayApiStrings.linkDotcreate
    - typings.sendsayApi.sendsayApiStrings.linkDotset
    - typings.sendsayApi.sendsayApiStrings.linkDotdelete
    - typings.sendsayApi.sendsayApiStrings.linkDotsetDotgroup
    - typings.sendsayApi.sendsayApiStrings.linkDotgroupDotlist
    - typings.sendsayApi.sendsayApiStrings.linkDotgroupDotget
    - typings.sendsayApi.sendsayApiStrings.linkDotgroupDotdelete
    - typings.sendsayApi.sendsayApiStrings.linkDotgroupDotset
    - typings.sendsayApi.sendsayApiStrings.webpageDotlist
    - typings.sendsayApi.sendsayApiStrings.webpageDotget
    - typings.sendsayApi.sendsayApiStrings.webpageDotset
    - typings.sendsayApi.sendsayApiStrings.webpageDotdelete
    - typings.sendsayApi.sendsayApiStrings.originDotlist
    - typings.sendsayApi.sendsayApiStrings.originDotget
    - typings.sendsayApi.sendsayApiStrings.originDotcreate
    - typings.sendsayApi.sendsayApiStrings.originDotset
    - typings.sendsayApi.sendsayApiStrings.originDotdelete
    - typings.sendsayApi.sendsayApiStrings.authextDotlist
    - typings.sendsayApi.sendsayApiStrings.authextDotget
    - typings.sendsayApi.sendsayApiStrings.authextDotcreate
    - typings.sendsayApi.sendsayApiStrings.authextDotset
    - typings.sendsayApi.sendsayApiStrings.authextDotdelete
    - typings.sendsayApi.sendsayApiStrings.authextDotgaDotprops
    - typings.sendsayApi.sendsayApiStrings.sysDotsettingsDotget
    - typings.sendsayApi.sendsayApiStrings.sysDotsettingsDotset
    - typings.sendsayApi.sendsayApiStrings.sysDotmessage
    - typings.sendsayApi.sendsayApiStrings.sysDotrightsDotlist
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotlist
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotcreate
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotget
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotset
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotdelete
    - typings.sendsayApi.sendsayApiStrings.sysDotpasswordDotset
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotapikeyDotcreate
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotapikeyDotget
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotapikeyDotdelete
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotrightsDotget
    - typings.sendsayApi.sendsayApiStrings.sysDotuserDotrightsDotset
    - typings.sendsayApi.sendsayApiStrings.sysDotaccountDotcreate
    - typings.sendsayApi.sendsayApiStrings.sysDotlog
    - typings.sendsayApi.sendsayApiStrings.sysDotstorageDotlist
    - typings.sendsayApi.sendsayApiStrings.sysDotstorageDotget
    - typings.sendsayApi.sendsayApiStrings.sysDotstorageDotset
    - typings.sendsayApi.sendsayApiStrings.sysDotstorageDotdelete
  */
  trait RequestAction extends StObject
  object RequestAction {
    
    inline def anketaDotcreate: typings.sendsayApi.sendsayApiStrings.anketaDotcreate = "anketa.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotcreate]
    
    inline def anketaDotdelete: typings.sendsayApi.sendsayApiStrings.anketaDotdelete = "anketa.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotdelete]
    
    inline def anketaDotget: typings.sendsayApi.sendsayApiStrings.anketaDotget = "anketa.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotget]
    
    inline def anketaDotlist: typings.sendsayApi.sendsayApiStrings.anketaDotlist = "anketa.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotlist]
    
    inline def anketaDotquestDotadd: typings.sendsayApi.sendsayApiStrings.anketaDotquestDotadd = "anketa.quest.add".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotquestDotadd]
    
    inline def anketaDotquestDotdelete: typings.sendsayApi.sendsayApiStrings.anketaDotquestDotdelete = "anketa.quest.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotquestDotdelete]
    
    inline def anketaDotquestDotorder: typings.sendsayApi.sendsayApiStrings.anketaDotquestDotorder = "anketa.quest.order".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotquestDotorder]
    
    inline def anketaDotquestDotresponseDotdelete: typings.sendsayApi.sendsayApiStrings.anketaDotquestDotresponseDotdelete = "anketa.quest.response.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotquestDotresponseDotdelete]
    
    inline def anketaDotquestDotresponseDotorder: typings.sendsayApi.sendsayApiStrings.anketaDotquestDotresponseDotorder = "anketa.quest.response.order".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotquestDotresponseDotorder]
    
    inline def anketaDotquestDotset: typings.sendsayApi.sendsayApiStrings.anketaDotquestDotset = "anketa.quest.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotquestDotset]
    
    inline def anketaDotset: typings.sendsayApi.sendsayApiStrings.anketaDotset = "anketa.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.anketaDotset]
    
    inline def authextDotcreate: typings.sendsayApi.sendsayApiStrings.authextDotcreate = "authext.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.authextDotcreate]
    
    inline def authextDotdelete: typings.sendsayApi.sendsayApiStrings.authextDotdelete = "authext.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.authextDotdelete]
    
    inline def authextDotgaDotprops: typings.sendsayApi.sendsayApiStrings.authextDotgaDotprops = "authext.ga.props".asInstanceOf[typings.sendsayApi.sendsayApiStrings.authextDotgaDotprops]
    
    inline def authextDotget: typings.sendsayApi.sendsayApiStrings.authextDotget = "authext.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.authextDotget]
    
    inline def authextDotlist: typings.sendsayApi.sendsayApiStrings.authextDotlist = "authext.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.authextDotlist]
    
    inline def authextDotset: typings.sendsayApi.sendsayApiStrings.authextDotset = "authext.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.authextDotset]
    
    inline def batch: typings.sendsayApi.sendsayApiStrings.batch = "batch".asInstanceOf[typings.sendsayApi.sendsayApiStrings.batch]
    
    inline def campaignDotdelete: typings.sendsayApi.sendsayApiStrings.campaignDotdelete = "campaign.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.campaignDotdelete]
    
    inline def campaignDotget: typings.sendsayApi.sendsayApiStrings.campaignDotget = "campaign.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.campaignDotget]
    
    inline def campaignDotlist: typings.sendsayApi.sendsayApiStrings.campaignDotlist = "campaign.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.campaignDotlist]
    
    inline def campaignDotmemberDotadd: typings.sendsayApi.sendsayApiStrings.campaignDotmemberDotadd = "campaign.member.add".asInstanceOf[typings.sendsayApi.sendsayApiStrings.campaignDotmemberDotadd]
    
    inline def campaignDotmemberDotdelete: typings.sendsayApi.sendsayApiStrings.campaignDotmemberDotdelete = "campaign.member.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.campaignDotmemberDotdelete]
    
    inline def campaignDotmemberDotlist: typings.sendsayApi.sendsayApiStrings.campaignDotmemberDotlist = "campaign.member.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.campaignDotmemberDotlist]
    
    inline def campaignDotset: typings.sendsayApi.sendsayApiStrings.campaignDotset = "campaign.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.campaignDotset]
    
    inline def cronDotcreate: typings.sendsayApi.sendsayApiStrings.cronDotcreate = "cron.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.cronDotcreate]
    
    inline def cronDotdelete: typings.sendsayApi.sendsayApiStrings.cronDotdelete = "cron.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.cronDotdelete]
    
    inline def cronDotget: typings.sendsayApi.sendsayApiStrings.cronDotget = "cron.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.cronDotget]
    
    inline def cronDotlist: typings.sendsayApi.sendsayApiStrings.cronDotlist = "cron.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.cronDotlist]
    
    inline def cronDotrunonce: typings.sendsayApi.sendsayApiStrings.cronDotrunonce = "cron.runonce".asInstanceOf[typings.sendsayApi.sendsayApiStrings.cronDotrunonce]
    
    inline def cronDotset: typings.sendsayApi.sendsayApiStrings.cronDotset = "cron.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.cronDotset]
    
    inline def datarowDotclean: typings.sendsayApi.sendsayApiStrings.datarowDotclean = "datarow.clean".asInstanceOf[typings.sendsayApi.sendsayApiStrings.datarowDotclean]
    
    inline def datarowDotcreate: typings.sendsayApi.sendsayApiStrings.datarowDotcreate = "datarow.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.datarowDotcreate]
    
    inline def datarowDotdelete: typings.sendsayApi.sendsayApiStrings.datarowDotdelete = "datarow.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.datarowDotdelete]
    
    inline def datarowDotget: typings.sendsayApi.sendsayApiStrings.datarowDotget = "datarow.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.datarowDotget]
    
    inline def datarowDotlist: typings.sendsayApi.sendsayApiStrings.datarowDotlist = "datarow.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.datarowDotlist]
    
    inline def datarowDotload: typings.sendsayApi.sendsayApiStrings.datarowDotload = "datarow.load".asInstanceOf[typings.sendsayApi.sendsayApiStrings.datarowDotload]
    
    inline def datarowDotset: typings.sendsayApi.sendsayApiStrings.datarowDotset = "datarow.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.datarowDotset]
    
    inline def emailDotcleanerror: typings.sendsayApi.sendsayApiStrings.emailDotcleanerror = "email.cleanerror".asInstanceOf[typings.sendsayApi.sendsayApiStrings.emailDotcleanerror]
    
    inline def emailDotget: typings.sendsayApi.sendsayApiStrings.emailDotget = "email.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.emailDotget]
    
    inline def emailDottest: typings.sendsayApi.sendsayApiStrings.emailDottest = "email.test".asInstanceOf[typings.sendsayApi.sendsayApiStrings.emailDottest]
    
    inline def formDotdelete: typings.sendsayApi.sendsayApiStrings.formDotdelete = "form.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formDotdelete]
    
    inline def formDotget: typings.sendsayApi.sendsayApiStrings.formDotget = "form.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formDotget]
    
    inline def formDotlist: typings.sendsayApi.sendsayApiStrings.formDotlist = "form.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formDotlist]
    
    inline def formDotset: typings.sendsayApi.sendsayApiStrings.formDotset = "form.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formDotset]
    
    inline def formDotsource: typings.sendsayApi.sendsayApiStrings.formDotsource = "form.source".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formDotsource]
    
    inline def formDottransfer: typings.sendsayApi.sendsayApiStrings.formDottransfer = "form.transfer".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formDottransfer]
    
    inline def formatDotdelete: typings.sendsayApi.sendsayApiStrings.formatDotdelete = "format.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formatDotdelete]
    
    inline def formatDotget: typings.sendsayApi.sendsayApiStrings.formatDotget = "format.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formatDotget]
    
    inline def formatDotlist: typings.sendsayApi.sendsayApiStrings.formatDotlist = "format.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formatDotlist]
    
    inline def formatDotset: typings.sendsayApi.sendsayApiStrings.formatDotset = "format.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.formatDotset]
    
    inline def groupDotclean: typings.sendsayApi.sendsayApiStrings.groupDotclean = "group.clean".asInstanceOf[typings.sendsayApi.sendsayApiStrings.groupDotclean]
    
    inline def groupDotcreate: typings.sendsayApi.sendsayApiStrings.groupDotcreate = "group.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.groupDotcreate]
    
    inline def groupDotdelete: typings.sendsayApi.sendsayApiStrings.groupDotdelete = "group.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.groupDotdelete]
    
    inline def groupDotfilterDotmatch: typings.sendsayApi.sendsayApiStrings.groupDotfilterDotmatch = "group.filter.match".asInstanceOf[typings.sendsayApi.sendsayApiStrings.groupDotfilterDotmatch]
    
    inline def groupDotfilterDotset: typings.sendsayApi.sendsayApiStrings.groupDotfilterDotset = "group.filter.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.groupDotfilterDotset]
    
    inline def groupDotget: typings.sendsayApi.sendsayApiStrings.groupDotget = "group.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.groupDotget]
    
    inline def groupDotlist: typings.sendsayApi.sendsayApiStrings.groupDotlist = "group.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.groupDotlist]
    
    inline def groupDotset: typings.sendsayApi.sendsayApiStrings.groupDotset = "group.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.groupDotset]
    
    inline def groupDotsnapshot: typings.sendsayApi.sendsayApiStrings.groupDotsnapshot = "group.snapshot".asInstanceOf[typings.sendsayApi.sendsayApiStrings.groupDotsnapshot]
    
    inline def infolettDotdelete: typings.sendsayApi.sendsayApiStrings.infolettDotdelete = "infolett.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.infolettDotdelete]
    
    inline def infolettDotget: typings.sendsayApi.sendsayApiStrings.infolettDotget = "infolett.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.infolettDotget]
    
    inline def infolettDotlist: typings.sendsayApi.sendsayApiStrings.infolettDotlist = "infolett.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.infolettDotlist]
    
    inline def infolettDotpreview: typings.sendsayApi.sendsayApiStrings.infolettDotpreview = "infolett.preview".asInstanceOf[typings.sendsayApi.sendsayApiStrings.infolettDotpreview]
    
    inline def infolettDotset: typings.sendsayApi.sendsayApiStrings.infolettDotset = "infolett.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.infolettDotset]
    
    inline def issueDotclassDotdelete: typings.sendsayApi.sendsayApiStrings.issueDotclassDotdelete = "issue.class.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotclassDotdelete]
    
    inline def issueDotclassDotget: typings.sendsayApi.sendsayApiStrings.issueDotclassDotget = "issue.class.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotclassDotget]
    
    inline def issueDotclassDotlist: typings.sendsayApi.sendsayApiStrings.issueDotclassDotlist = "issue.class.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotclassDotlist]
    
    inline def issueDotdkimDotcheck: typings.sendsayApi.sendsayApiStrings.issueDotdkimDotcheck = "issue.dkim.check".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdkimDotcheck]
    
    inline def issueDotdkimDotcreate: typings.sendsayApi.sendsayApiStrings.issueDotdkimDotcreate = "issue.dkim.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdkimDotcreate]
    
    inline def issueDotdkimDotdelete: typings.sendsayApi.sendsayApiStrings.issueDotdkimDotdelete = "issue.dkim.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdkimDotdelete]
    
    inline def issueDotdkimDotget: typings.sendsayApi.sendsayApiStrings.issueDotdkimDotget = "issue.dkim.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdkimDotget]
    
    inline def issueDotdkimDotlist: typings.sendsayApi.sendsayApiStrings.issueDotdkimDotlist = "issue.dkim.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdkimDotlist]
    
    inline def issueDotdraftDotdelete: typings.sendsayApi.sendsayApiStrings.issueDotdraftDotdelete = "issue.draft.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdraftDotdelete]
    
    inline def issueDotdraftDotget: typings.sendsayApi.sendsayApiStrings.issueDotdraftDotget = "issue.draft.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdraftDotget]
    
    inline def issueDotdraftDotlist: typings.sendsayApi.sendsayApiStrings.issueDotdraftDotlist = "issue.draft.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdraftDotlist]
    
    inline def issueDotdraftDotpreview: typings.sendsayApi.sendsayApiStrings.issueDotdraftDotpreview = "issue.draft.preview".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdraftDotpreview]
    
    inline def issueDotdraftDotset: typings.sendsayApi.sendsayApiStrings.issueDotdraftDotset = "issue.draft.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotdraftDotset]
    
    inline def issueDotemailsenderDotdelete: typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotdelete = "issue.emailsender.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotdelete]
    
    inline def issueDotemailsenderDotget: typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotget = "issue.emailsender.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotget]
    
    inline def issueDotemailsenderDotlist: typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotlist = "issue.emailsender.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotlist]
    
    inline def issueDotemailsenderDotset: typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotset = "issue.emailsender.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotemailsenderDotset]
    
    inline def issueDotget: typings.sendsayApi.sendsayApiStrings.issueDotget = "issue.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotget]
    
    inline def issueDotgetDotattach: typings.sendsayApi.sendsayApiStrings.issueDotgetDotattach = "issue.get.attach".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotgetDotattach]
    
    inline def issueDotlaterDotdelete: typings.sendsayApi.sendsayApiStrings.issueDotlaterDotdelete = "issue.later.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotlaterDotdelete]
    
    inline def issueDotlaterDotget: typings.sendsayApi.sendsayApiStrings.issueDotlaterDotget = "issue.later.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotlaterDotget]
    
    inline def issueDotlaterDotlist: typings.sendsayApi.sendsayApiStrings.issueDotlaterDotlist = "issue.later.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotlaterDotlist]
    
    inline def issueDotlaterDotsend: typings.sendsayApi.sendsayApiStrings.issueDotlaterDotsend = "issue.later.send".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotlaterDotsend]
    
    inline def issueDotlaterDotset: typings.sendsayApi.sendsayApiStrings.issueDotlaterDotset = "issue.later.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotlaterDotset]
    
    inline def issueDotlist: typings.sendsayApi.sendsayApiStrings.issueDotlist = "issue.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotlist]
    
    inline def issueDotmultiDotget: typings.sendsayApi.sendsayApiStrings.issueDotmultiDotget = "issue.multi.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotmultiDotget]
    
    inline def issueDotmultiDotlist: typings.sendsayApi.sendsayApiStrings.issueDotmultiDotlist = "issue.multi.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotmultiDotlist]
    
    inline def issueDotrunningDotdelete: typings.sendsayApi.sendsayApiStrings.issueDotrunningDotdelete = "issue.running.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotrunningDotdelete]
    
    inline def issueDotrunningDotlist: typings.sendsayApi.sendsayApiStrings.issueDotrunningDotlist = "issue.running.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotrunningDotlist]
    
    inline def issueDotrunningDotpause: typings.sendsayApi.sendsayApiStrings.issueDotrunningDotpause = "issue.running.pause".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotrunningDotpause]
    
    inline def issueDotrunningDotresume: typings.sendsayApi.sendsayApiStrings.issueDotrunningDotresume = "issue.running.resume".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotrunningDotresume]
    
    inline def issueDotrunningDotstart: typings.sendsayApi.sendsayApiStrings.issueDotrunningDotstart = "issue.running.start".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotrunningDotstart]
    
    inline def issueDotsend: typings.sendsayApi.sendsayApiStrings.issueDotsend = "issue.send".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsend]
    
    inline def issueDotsendDotmulti: typings.sendsayApi.sendsayApiStrings.issueDotsendDotmulti = "issue.send.multi".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsendDotmulti]
    
    inline def issueDotsendDottest: typings.sendsayApi.sendsayApiStrings.issueDotsendDottest = "issue.send.test".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsendDottest]
    
    inline def issueDotsmssenderDotdelete: typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotdelete = "issue.smssender.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotdelete]
    
    inline def issueDotsmssenderDotget: typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotget = "issue.smssender.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotget]
    
    inline def issueDotsmssenderDotlist: typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotlist = "issue.smssender.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotlist]
    
    inline def issueDotsmssenderDotset: typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotset = "issue.smssender.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsmssenderDotset]
    
    inline def issueDotsplitDotcreate: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotcreate = "issue.split.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotcreate]
    
    inline def issueDotsplitDotdelete: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotdelete = "issue.split.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotdelete]
    
    inline def issueDotsplitDotget: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotget = "issue.split.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotget]
    
    inline def issueDotsplitDotlist: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotlist = "issue.split.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotlist]
    
    inline def issueDotsplitDotset: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotset = "issue.split.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotset]
    
    inline def issueDotsplitDotvariantDotcreate: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotcreate = "issue.split.variant.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotcreate]
    
    inline def issueDotsplitDotvariantDotdelete: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotdelete = "issue.split.variant.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotdelete]
    
    inline def issueDotsplitDotvariantDotlist: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotlist = "issue.split.variant.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotlist]
    
    inline def issueDotsplitDotvariantDotset: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotset = "issue.split.variant.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotvariantDotset]
    
    inline def issueDotsplitDotwinner: typings.sendsayApi.sendsayApiStrings.issueDotsplitDotwinner = "issue.split.winner".asInstanceOf[typings.sendsayApi.sendsayApiStrings.issueDotsplitDotwinner]
    
    inline def lentaDotdelete: typings.sendsayApi.sendsayApiStrings.lentaDotdelete = "lenta.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.lentaDotdelete]
    
    inline def lentaDotget: typings.sendsayApi.sendsayApiStrings.lentaDotget = "lenta.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.lentaDotget]
    
    inline def lentaDotlist: typings.sendsayApi.sendsayApiStrings.lentaDotlist = "lenta.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.lentaDotlist]
    
    inline def lentaDotsend: typings.sendsayApi.sendsayApiStrings.lentaDotsend = "lenta.send".asInstanceOf[typings.sendsayApi.sendsayApiStrings.lentaDotsend]
    
    inline def lentaDotset: typings.sendsayApi.sendsayApiStrings.lentaDotset = "lenta.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.lentaDotset]
    
    inline def lentaDotsourceDotdelete: typings.sendsayApi.sendsayApiStrings.lentaDotsourceDotdelete = "lenta.source.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.lentaDotsourceDotdelete]
    
    inline def lentaDotsourceDotrefresh: typings.sendsayApi.sendsayApiStrings.lentaDotsourceDotrefresh = "lenta.source.refresh".asInstanceOf[typings.sendsayApi.sendsayApiStrings.lentaDotsourceDotrefresh]
    
    inline def linkDotcreate: typings.sendsayApi.sendsayApiStrings.linkDotcreate = "link.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotcreate]
    
    inline def linkDotdelete: typings.sendsayApi.sendsayApiStrings.linkDotdelete = "link.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotdelete]
    
    inline def linkDotget: typings.sendsayApi.sendsayApiStrings.linkDotget = "link.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotget]
    
    inline def linkDotgroupDotdelete: typings.sendsayApi.sendsayApiStrings.linkDotgroupDotdelete = "link.group.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotgroupDotdelete]
    
    inline def linkDotgroupDotget: typings.sendsayApi.sendsayApiStrings.linkDotgroupDotget = "link.group.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotgroupDotget]
    
    inline def linkDotgroupDotlist: typings.sendsayApi.sendsayApiStrings.linkDotgroupDotlist = "link.group.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotgroupDotlist]
    
    inline def linkDotgroupDotset: typings.sendsayApi.sendsayApiStrings.linkDotgroupDotset = "link.group.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotgroupDotset]
    
    inline def linkDotlist: typings.sendsayApi.sendsayApiStrings.linkDotlist = "link.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotlist]
    
    inline def linkDotset: typings.sendsayApi.sendsayApiStrings.linkDotset = "link.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotset]
    
    inline def linkDotsetDotgroup: typings.sendsayApi.sendsayApiStrings.linkDotsetDotgroup = "link.set.group".asInstanceOf[typings.sendsayApi.sendsayApiStrings.linkDotsetDotgroup]
    
    inline def login: typings.sendsayApi.sendsayApiStrings.login = "login".asInstanceOf[typings.sendsayApi.sendsayApiStrings.login]
    
    inline def loginDotagsesDotchallenge: typings.sendsayApi.sendsayApiStrings.loginDotagsesDotchallenge = "login.agses.challenge".asInstanceOf[typings.sendsayApi.sendsayApiStrings.loginDotagsesDotchallenge]
    
    inline def logout: typings.sendsayApi.sendsayApiStrings.logout = "logout".asInstanceOf[typings.sendsayApi.sendsayApiStrings.logout]
    
    inline def memberDotdelete: typings.sendsayApi.sendsayApiStrings.memberDotdelete = "member.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotdelete]
    
    inline def memberDotexists: typings.sendsayApi.sendsayApiStrings.memberDotexists = "member.exists".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotexists]
    
    inline def memberDotfind: typings.sendsayApi.sendsayApiStrings.memberDotfind = "member.find".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotfind]
    
    inline def memberDotget: typings.sendsayApi.sendsayApiStrings.memberDotget = "member.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotget]
    
    inline def memberDotheadDotattach: typings.sendsayApi.sendsayApiStrings.memberDotheadDotattach = "member.head.attach".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotheadDotattach]
    
    inline def memberDotheadDotdetach: typings.sendsayApi.sendsayApiStrings.memberDotheadDotdetach = "member.head.detach".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotheadDotdetach]
    
    inline def memberDotheadDotlist: typings.sendsayApi.sendsayApiStrings.memberDotheadDotlist = "member.head.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotheadDotlist]
    
    inline def memberDotheadDotreplace: typings.sendsayApi.sendsayApiStrings.memberDotheadDotreplace = "member.head.replace".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotheadDotreplace]
    
    inline def memberDotimport: typings.sendsayApi.sendsayApiStrings.memberDotimport = "member.import".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotimport]
    
    inline def memberDotimportDotprobe: typings.sendsayApi.sendsayApiStrings.memberDotimportDotprobe = "member.import.probe".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotimportDotprobe]
    
    inline def memberDotlist: typings.sendsayApi.sendsayApiStrings.memberDotlist = "member.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotlist]
    
    inline def memberDotlistDotcount: typings.sendsayApi.sendsayApiStrings.memberDotlistDotcount = "member.list.count".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotlistDotcount]
    
    inline def memberDotmerge: typings.sendsayApi.sendsayApiStrings.memberDotmerge = "member.merge".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotmerge]
    
    inline def memberDotsendconfirm: typings.sendsayApi.sendsayApiStrings.memberDotsendconfirm = "member.sendconfirm".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotsendconfirm]
    
    inline def memberDotset: typings.sendsayApi.sendsayApiStrings.memberDotset = "member.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotset]
    
    inline def memberDotupdate: typings.sendsayApi.sendsayApiStrings.memberDotupdate = "member.update".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotupdate]
    
    inline def memberDotwhere: typings.sendsayApi.sendsayApiStrings.memberDotwhere = "member.where".asInstanceOf[typings.sendsayApi.sendsayApiStrings.memberDotwhere]
    
    inline def originDotcreate: typings.sendsayApi.sendsayApiStrings.originDotcreate = "origin.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.originDotcreate]
    
    inline def originDotdelete: typings.sendsayApi.sendsayApiStrings.originDotdelete = "origin.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.originDotdelete]
    
    inline def originDotget: typings.sendsayApi.sendsayApiStrings.originDotget = "origin.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.originDotget]
    
    inline def originDotlist: typings.sendsayApi.sendsayApiStrings.originDotlist = "origin.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.originDotlist]
    
    inline def originDotset: typings.sendsayApi.sendsayApiStrings.originDotset = "origin.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.originDotset]
    
    inline def ping: typings.sendsayApi.sendsayApiStrings.ping = "ping".asInstanceOf[typings.sendsayApi.sendsayApiStrings.ping]
    
    inline def pong: typings.sendsayApi.sendsayApiStrings.pong = "pong".asInstanceOf[typings.sendsayApi.sendsayApiStrings.pong]
    
    inline def rfsDotdirDotdelete: typings.sendsayApi.sendsayApiStrings.rfsDotdirDotdelete = "rfs.dir.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.rfsDotdirDotdelete]
    
    inline def rfsDotdirDotmake: typings.sendsayApi.sendsayApiStrings.rfsDotdirDotmake = "rfs.dir.make".asInstanceOf[typings.sendsayApi.sendsayApiStrings.rfsDotdirDotmake]
    
    inline def rfsDotfileDotdelete: typings.sendsayApi.sendsayApiStrings.rfsDotfileDotdelete = "rfs.file.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.rfsDotfileDotdelete]
    
    inline def rfsDotfileDotget: typings.sendsayApi.sendsayApiStrings.rfsDotfileDotget = "rfs.file.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.rfsDotfileDotget]
    
    inline def rfsDotfileDotput: typings.sendsayApi.sendsayApiStrings.rfsDotfileDotput = "rfs.file.put".asInstanceOf[typings.sendsayApi.sendsayApiStrings.rfsDotfileDotput]
    
    inline def rfsDotlist: typings.sendsayApi.sendsayApiStrings.rfsDotlist = "rfs.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.rfsDotlist]
    
    inline def rfsDotrename: typings.sendsayApi.sendsayApiStrings.rfsDotrename = "rfs.rename".asInstanceOf[typings.sendsayApi.sendsayApiStrings.rfsDotrename]
    
    inline def sequenceDotcreate: typings.sendsayApi.sendsayApiStrings.sequenceDotcreate = "sequence.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotcreate]
    
    inline def sequenceDotdelete: typings.sendsayApi.sendsayApiStrings.sequenceDotdelete = "sequence.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotdelete]
    
    inline def sequenceDotget: typings.sendsayApi.sendsayApiStrings.sequenceDotget = "sequence.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotget]
    
    inline def sequenceDotlist: typings.sendsayApi.sendsayApiStrings.sequenceDotlist = "sequence.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotlist]
    
    inline def sequenceDotmemberDotmembership: typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotmembership = "sequence.member.membership".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotmembership]
    
    inline def sequenceDotmemberDotpause: typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotpause = "sequence.member.pause".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotpause]
    
    inline def sequenceDotmemberDotresume: typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotresume = "sequence.member.resume".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotresume]
    
    inline def sequenceDotmemberDotstart: typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotstart = "sequence.member.start".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotstart]
    
    inline def sequenceDotmemberDotstop: typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotstop = "sequence.member.stop".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotmemberDotstop]
    
    inline def sequenceDotset: typings.sendsayApi.sendsayApiStrings.sequenceDotset = "sequence.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotset]
    
    inline def sequenceDotstepsDotget: typings.sendsayApi.sendsayApiStrings.sequenceDotstepsDotget = "sequence.steps.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotstepsDotget]
    
    inline def sequenceDotstepsDotset: typings.sendsayApi.sendsayApiStrings.sequenceDotstepsDotset = "sequence.steps.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sequenceDotstepsDotset]
    
    inline def statDotuni: typings.sendsayApi.sendsayApiStrings.statDotuni = "stat.uni".asInstanceOf[typings.sendsayApi.sendsayApiStrings.statDotuni]
    
    inline def stoplistDotadd: typings.sendsayApi.sendsayApiStrings.stoplistDotadd = "stoplist.add".asInstanceOf[typings.sendsayApi.sendsayApiStrings.stoplistDotadd]
    
    inline def stoplistDotdelete: typings.sendsayApi.sendsayApiStrings.stoplistDotdelete = "stoplist.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.stoplistDotdelete]
    
    inline def stoplistDoterase: typings.sendsayApi.sendsayApiStrings.stoplistDoterase = "stoplist.erase".asInstanceOf[typings.sendsayApi.sendsayApiStrings.stoplistDoterase]
    
    inline def stoplistDotget: typings.sendsayApi.sendsayApiStrings.stoplistDotget = "stoplist.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.stoplistDotget]
    
    inline def sysDotaccountDotcreate: typings.sendsayApi.sendsayApiStrings.sysDotaccountDotcreate = "sys.account.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotaccountDotcreate]
    
    inline def sysDotlog: typings.sendsayApi.sendsayApiStrings.sysDotlog = "sys.log".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotlog]
    
    inline def sysDotmessage: typings.sendsayApi.sendsayApiStrings.sysDotmessage = "sys.message".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotmessage]
    
    inline def sysDotpasswordDotset: typings.sendsayApi.sendsayApiStrings.sysDotpasswordDotset = "sys.password.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotpasswordDotset]
    
    inline def sysDotrightsDotlist: typings.sendsayApi.sendsayApiStrings.sysDotrightsDotlist = "sys.rights.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotrightsDotlist]
    
    inline def sysDotsettingsDotget: typings.sendsayApi.sendsayApiStrings.sysDotsettingsDotget = "sys.settings.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotsettingsDotget]
    
    inline def sysDotsettingsDotset: typings.sendsayApi.sendsayApiStrings.sysDotsettingsDotset = "sys.settings.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotsettingsDotset]
    
    inline def sysDotstorageDotdelete: typings.sendsayApi.sendsayApiStrings.sysDotstorageDotdelete = "sys.storage.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotstorageDotdelete]
    
    inline def sysDotstorageDotget: typings.sendsayApi.sendsayApiStrings.sysDotstorageDotget = "sys.storage.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotstorageDotget]
    
    inline def sysDotstorageDotlist: typings.sendsayApi.sendsayApiStrings.sysDotstorageDotlist = "sys.storage.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotstorageDotlist]
    
    inline def sysDotstorageDotset: typings.sendsayApi.sendsayApiStrings.sysDotstorageDotset = "sys.storage.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotstorageDotset]
    
    inline def sysDotuserDotapikeyDotcreate: typings.sendsayApi.sendsayApiStrings.sysDotuserDotapikeyDotcreate = "sys.user.apikey.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotapikeyDotcreate]
    
    inline def sysDotuserDotapikeyDotdelete: typings.sendsayApi.sendsayApiStrings.sysDotuserDotapikeyDotdelete = "sys.user.apikey.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotapikeyDotdelete]
    
    inline def sysDotuserDotapikeyDotget: typings.sendsayApi.sendsayApiStrings.sysDotuserDotapikeyDotget = "sys.user.apikey.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotapikeyDotget]
    
    inline def sysDotuserDotcreate: typings.sendsayApi.sendsayApiStrings.sysDotuserDotcreate = "sys.user.create".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotcreate]
    
    inline def sysDotuserDotdelete: typings.sendsayApi.sendsayApiStrings.sysDotuserDotdelete = "sys.user.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotdelete]
    
    inline def sysDotuserDotget: typings.sendsayApi.sendsayApiStrings.sysDotuserDotget = "sys.user.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotget]
    
    inline def sysDotuserDotlist: typings.sendsayApi.sendsayApiStrings.sysDotuserDotlist = "sys.user.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotlist]
    
    inline def sysDotuserDotrightsDotget: typings.sendsayApi.sendsayApiStrings.sysDotuserDotrightsDotget = "sys.user.rights.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotrightsDotget]
    
    inline def sysDotuserDotrightsDotset: typings.sendsayApi.sendsayApiStrings.sysDotuserDotrightsDotset = "sys.user.rights.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotrightsDotset]
    
    inline def sysDotuserDotset: typings.sendsayApi.sendsayApiStrings.sysDotuserDotset = "sys.user.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.sysDotuserDotset]
    
    inline def trackDotget: typings.sendsayApi.sendsayApiStrings.trackDotget = "track.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.trackDotget]
    
    inline def trackDotlist: typings.sendsayApi.sendsayApiStrings.trackDotlist = "track.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.trackDotlist]
    
    inline def webpageDotdelete: typings.sendsayApi.sendsayApiStrings.webpageDotdelete = "webpage.delete".asInstanceOf[typings.sendsayApi.sendsayApiStrings.webpageDotdelete]
    
    inline def webpageDotget: typings.sendsayApi.sendsayApiStrings.webpageDotget = "webpage.get".asInstanceOf[typings.sendsayApi.sendsayApiStrings.webpageDotget]
    
    inline def webpageDotlist: typings.sendsayApi.sendsayApiStrings.webpageDotlist = "webpage.list".asInstanceOf[typings.sendsayApi.sendsayApiStrings.webpageDotlist]
    
    inline def webpageDotset: typings.sendsayApi.sendsayApiStrings.webpageDotset = "webpage.set".asInstanceOf[typings.sendsayApi.sendsayApiStrings.webpageDotset]
    
    inline def xxx: typings.sendsayApi.sendsayApiStrings.xxx = "xxx".asInstanceOf[typings.sendsayApi.sendsayApiStrings.xxx]
  }
  
  @js.native
  trait Sendsay extends StObject {
    
    def callErrorHandler(err: js.Error): Unit = js.native
    
    def catchConnectionErrors(err: js.Error): scala.Nothing = js.native
    
    def checkRedirect(req: SendsayRequest, res: SendsayResponse, options: SendsayRequestOptions): SendsayResponse = js.native
    
    def checkResponseErrors(req: SendsayRequest, res: SendsayResponse, options: SendsayRequestOptions): SendsayResponse = js.native
    
    def checkStatus(res: SendsayResponse): js.Promise[SendsayResponse] = js.native
    
    def getRequestBody(req: SendsayResponse): String = js.native
    
    def getRequestData(req: SendsayResponse): String = js.native
    
    def getRequestId(): String = js.native
    
    def getUsername(): String = js.native
    
    def login(): js.Promise[Unit] = js.native
    
    def onError(handler: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def parseResponse(res: SendsayResponse): js.Promise[SendsayResponse] = js.native
    
    def performRequest(req: SendsayRequest, options: SendsayRequestOptions): js.Promise[SendsayResponse] = js.native
    
    def request(req: SendsayRequest): js.Promise[SendsayResponse] = js.native
    def request(req: SendsayRequest, options: SendsayRequestOptions): js.Promise[SendsayResponse] = js.native
    
    def setPolicy(policy: String): Unit = js.native
    
    def setPolicyFromCookie(name: String): Unit = js.native
    
    def setSession(session: String): Unit = js.native
    
    def setSessionFromCookie(name: String): Unit = js.native
  }
  
  trait SendsayOptionsApiKey
    extends StObject
       with BaseSendsayOptions {
    
    var apiKey: String
  }
  object SendsayOptionsApiKey {
    
    inline def apply(apiKey: String): SendsayOptionsApiKey = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendsayOptionsApiKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendsayOptionsApiKey] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendsayOptionsAuth
    extends StObject
       with BaseSendsayOptions {
    
    var auth: Login
  }
  object SendsayOptionsAuth {
    
    inline def apply(auth: Login): SendsayOptionsAuth = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendsayOptionsAuth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendsayOptionsAuth] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: Login): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendsayRequest
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var action: RequestAction
  }
  object SendsayRequest {
    
    inline def apply(action: RequestAction): SendsayRequest = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendsayRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendsayRequest] (val x: Self) extends AnyVal {
      
      inline def setAction(value: RequestAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  type SendsayRequestOptions = Record[String, Any]
  
  type SendsayResponse = Record[String, Any]
}
