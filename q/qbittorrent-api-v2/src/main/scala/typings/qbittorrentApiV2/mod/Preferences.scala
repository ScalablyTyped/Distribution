package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preferences extends StObject {
  
  var alt_dl_limit: Double
  
  var alt_up_limit: Double
  
  var alternative_webui_enabled: Boolean
  
  var alternative_webui_path: String
  
  var anonymous_mode: Boolean
  
  var auto_delete_mode: Double
  
  var auto_tmm_enabled: Boolean
  
  var autorun_enabled: Boolean
  
  var autorun_program: String
  
  var bypass_auth_subnet_whitelist: String
  
  var bypass_auth_subnet_whitelist_enabled: Boolean
  
  var bypass_local_auth: Boolean
  
  var category_changed_tmm_enabled: Boolean
  
  var create_subfolder_enabled: Boolean
  
  var dht: Boolean
  
  var dhtSameAsBT: Boolean
  
  var dht_port: Double
  
  var dl_limit: Double
  
  var dont_count_slow_torrents: Boolean
  
  var dyndns_domain: String
  
  var dyndns_enabled: Boolean
  
  var dyndns_password: String
  
  var dyndns_service: Double
  
  var dyndns_username: String
  
  var enable_utp: Boolean
  
  var encryption: Double
  
  var export_dir: String
  
  var export_dir_fin: String
  
  var force_proxy: Boolean
  
  var incomplete_files_ext: Boolean
  
  var ip_filter_enabled: Boolean
  
  var ip_filter_path: String
  
  var ip_filter_trackers: Boolean
  
  var limit_lan_peers: Boolean
  
  var limit_tcp_overhead: Boolean
  
  var limit_utp_rate: Boolean
  
  var listen_port: Double
  
  var locale: String
  
  var lsd: Boolean
  
  var mail_notification_auth_enabled: Boolean
  
  var mail_notification_email: String
  
  var mail_notification_enabled: Boolean
  
  var mail_notification_password: String
  
  var mail_notification_sender: String
  
  var mail_notification_smtp: String
  
  var mail_notification_ssl_enabled: Boolean
  
  var mail_notification_username: String
  
  var max_active_downloads: Double
  
  var max_active_torrents: Double
  
  var max_active_uploads: Double
  
  var max_connec: Double
  
  var max_connec_per_torrent: Double
  
  var max_ratio: Double
  
  var max_ratio_act: Boolean
  
  var max_ratio_enabled: Boolean
  
  var max_uploads: Double
  
  var max_uploads_per_torrent: Double
  
  var pex: Boolean
  
  var preallocate_all: Boolean
  
  var proxy_auth_enabled: Boolean
  
  var proxy_ip: String
  
  var proxy_password: String
  
  var proxy_peer_connections: Boolean
  
  var proxy_port: Double
  
  var proxy_type: Double
  
  var proxy_username: String
  
  var queueing_enabled: Boolean
  
  var random_port: Boolean
  
  var rss_auto_downloading_enabled: Boolean
  
  var rss_max_articles_per_feed: Double
  
  var rss_processing_enabled: Boolean
  
  var rss_refresh_interval: Double
  
  var save_path: String
  
  var save_path_changed_tmm_enabled: Boolean
  
  var scan_dirs: js.Object
  
  var schedule_from_hour: Double
  
  var schedule_from_min: Double
  
  var schedule_to_hour: Double
  
  var schedule_to_min: Double
  
  var scheduler_days: Double
  
  var scheduler_enabled: Boolean
  
  var slow_torrent_dl_rate_threshold: Double
  
  var slow_torrent_inactive_timer: Double
  
  var slow_torrent_ul_rate_threshold: Double
  
  var ssl_cert: String
  
  var ssl_key: String
  
  var start_paused_enabled: Boolean
  
  var temp_path: String
  
  var temp_path_enabled: Boolean
  
  var torrent_changed_tmm_enabled: Boolean
  
  var up_limit: Double
  
  var upnp: Boolean
  
  var use_https: Boolean
  
  var web_ui_address: String
  
  var web_ui_clickjacking_protection_enabled: Boolean
  
  // writeonly
  var web_ui_csrf_protection_enabled: Boolean
  
  var web_ui_domain_list: String
  
  var web_ui_password: String
  
  var web_ui_port: Double
  
  var web_ui_upnp: Boolean
  
  var web_ui_username: String
}
object Preferences {
  
  inline def apply(
    alt_dl_limit: Double,
    alt_up_limit: Double,
    alternative_webui_enabled: Boolean,
    alternative_webui_path: String,
    anonymous_mode: Boolean,
    auto_delete_mode: Double,
    auto_tmm_enabled: Boolean,
    autorun_enabled: Boolean,
    autorun_program: String,
    bypass_auth_subnet_whitelist: String,
    bypass_auth_subnet_whitelist_enabled: Boolean,
    bypass_local_auth: Boolean,
    category_changed_tmm_enabled: Boolean,
    create_subfolder_enabled: Boolean,
    dht: Boolean,
    dhtSameAsBT: Boolean,
    dht_port: Double,
    dl_limit: Double,
    dont_count_slow_torrents: Boolean,
    dyndns_domain: String,
    dyndns_enabled: Boolean,
    dyndns_password: String,
    dyndns_service: Double,
    dyndns_username: String,
    enable_utp: Boolean,
    encryption: Double,
    export_dir: String,
    export_dir_fin: String,
    force_proxy: Boolean,
    incomplete_files_ext: Boolean,
    ip_filter_enabled: Boolean,
    ip_filter_path: String,
    ip_filter_trackers: Boolean,
    limit_lan_peers: Boolean,
    limit_tcp_overhead: Boolean,
    limit_utp_rate: Boolean,
    listen_port: Double,
    locale: String,
    lsd: Boolean,
    mail_notification_auth_enabled: Boolean,
    mail_notification_email: String,
    mail_notification_enabled: Boolean,
    mail_notification_password: String,
    mail_notification_sender: String,
    mail_notification_smtp: String,
    mail_notification_ssl_enabled: Boolean,
    mail_notification_username: String,
    max_active_downloads: Double,
    max_active_torrents: Double,
    max_active_uploads: Double,
    max_connec: Double,
    max_connec_per_torrent: Double,
    max_ratio: Double,
    max_ratio_act: Boolean,
    max_ratio_enabled: Boolean,
    max_uploads: Double,
    max_uploads_per_torrent: Double,
    pex: Boolean,
    preallocate_all: Boolean,
    proxy_auth_enabled: Boolean,
    proxy_ip: String,
    proxy_password: String,
    proxy_peer_connections: Boolean,
    proxy_port: Double,
    proxy_type: Double,
    proxy_username: String,
    queueing_enabled: Boolean,
    random_port: Boolean,
    rss_auto_downloading_enabled: Boolean,
    rss_max_articles_per_feed: Double,
    rss_processing_enabled: Boolean,
    rss_refresh_interval: Double,
    save_path: String,
    save_path_changed_tmm_enabled: Boolean,
    scan_dirs: js.Object,
    schedule_from_hour: Double,
    schedule_from_min: Double,
    schedule_to_hour: Double,
    schedule_to_min: Double,
    scheduler_days: Double,
    scheduler_enabled: Boolean,
    slow_torrent_dl_rate_threshold: Double,
    slow_torrent_inactive_timer: Double,
    slow_torrent_ul_rate_threshold: Double,
    ssl_cert: String,
    ssl_key: String,
    start_paused_enabled: Boolean,
    temp_path: String,
    temp_path_enabled: Boolean,
    torrent_changed_tmm_enabled: Boolean,
    up_limit: Double,
    upnp: Boolean,
    use_https: Boolean,
    web_ui_address: String,
    web_ui_clickjacking_protection_enabled: Boolean,
    web_ui_csrf_protection_enabled: Boolean,
    web_ui_domain_list: String,
    web_ui_password: String,
    web_ui_port: Double,
    web_ui_upnp: Boolean,
    web_ui_username: String
  ): Preferences = {
    val __obj = js.Dynamic.literal(alt_dl_limit = alt_dl_limit.asInstanceOf[js.Any], alt_up_limit = alt_up_limit.asInstanceOf[js.Any], alternative_webui_enabled = alternative_webui_enabled.asInstanceOf[js.Any], alternative_webui_path = alternative_webui_path.asInstanceOf[js.Any], anonymous_mode = anonymous_mode.asInstanceOf[js.Any], auto_delete_mode = auto_delete_mode.asInstanceOf[js.Any], auto_tmm_enabled = auto_tmm_enabled.asInstanceOf[js.Any], autorun_enabled = autorun_enabled.asInstanceOf[js.Any], autorun_program = autorun_program.asInstanceOf[js.Any], bypass_auth_subnet_whitelist = bypass_auth_subnet_whitelist.asInstanceOf[js.Any], bypass_auth_subnet_whitelist_enabled = bypass_auth_subnet_whitelist_enabled.asInstanceOf[js.Any], bypass_local_auth = bypass_local_auth.asInstanceOf[js.Any], category_changed_tmm_enabled = category_changed_tmm_enabled.asInstanceOf[js.Any], create_subfolder_enabled = create_subfolder_enabled.asInstanceOf[js.Any], dht = dht.asInstanceOf[js.Any], dhtSameAsBT = dhtSameAsBT.asInstanceOf[js.Any], dht_port = dht_port.asInstanceOf[js.Any], dl_limit = dl_limit.asInstanceOf[js.Any], dont_count_slow_torrents = dont_count_slow_torrents.asInstanceOf[js.Any], dyndns_domain = dyndns_domain.asInstanceOf[js.Any], dyndns_enabled = dyndns_enabled.asInstanceOf[js.Any], dyndns_password = dyndns_password.asInstanceOf[js.Any], dyndns_service = dyndns_service.asInstanceOf[js.Any], dyndns_username = dyndns_username.asInstanceOf[js.Any], enable_utp = enable_utp.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], export_dir = export_dir.asInstanceOf[js.Any], export_dir_fin = export_dir_fin.asInstanceOf[js.Any], force_proxy = force_proxy.asInstanceOf[js.Any], incomplete_files_ext = incomplete_files_ext.asInstanceOf[js.Any], ip_filter_enabled = ip_filter_enabled.asInstanceOf[js.Any], ip_filter_path = ip_filter_path.asInstanceOf[js.Any], ip_filter_trackers = ip_filter_trackers.asInstanceOf[js.Any], limit_lan_peers = limit_lan_peers.asInstanceOf[js.Any], limit_tcp_overhead = limit_tcp_overhead.asInstanceOf[js.Any], limit_utp_rate = limit_utp_rate.asInstanceOf[js.Any], listen_port = listen_port.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lsd = lsd.asInstanceOf[js.Any], mail_notification_auth_enabled = mail_notification_auth_enabled.asInstanceOf[js.Any], mail_notification_email = mail_notification_email.asInstanceOf[js.Any], mail_notification_enabled = mail_notification_enabled.asInstanceOf[js.Any], mail_notification_password = mail_notification_password.asInstanceOf[js.Any], mail_notification_sender = mail_notification_sender.asInstanceOf[js.Any], mail_notification_smtp = mail_notification_smtp.asInstanceOf[js.Any], mail_notification_ssl_enabled = mail_notification_ssl_enabled.asInstanceOf[js.Any], mail_notification_username = mail_notification_username.asInstanceOf[js.Any], max_active_downloads = max_active_downloads.asInstanceOf[js.Any], max_active_torrents = max_active_torrents.asInstanceOf[js.Any], max_active_uploads = max_active_uploads.asInstanceOf[js.Any], max_connec = max_connec.asInstanceOf[js.Any], max_connec_per_torrent = max_connec_per_torrent.asInstanceOf[js.Any], max_ratio = max_ratio.asInstanceOf[js.Any], max_ratio_act = max_ratio_act.asInstanceOf[js.Any], max_ratio_enabled = max_ratio_enabled.asInstanceOf[js.Any], max_uploads = max_uploads.asInstanceOf[js.Any], max_uploads_per_torrent = max_uploads_per_torrent.asInstanceOf[js.Any], pex = pex.asInstanceOf[js.Any], preallocate_all = preallocate_all.asInstanceOf[js.Any], proxy_auth_enabled = proxy_auth_enabled.asInstanceOf[js.Any], proxy_ip = proxy_ip.asInstanceOf[js.Any], proxy_password = proxy_password.asInstanceOf[js.Any], proxy_peer_connections = proxy_peer_connections.asInstanceOf[js.Any], proxy_port = proxy_port.asInstanceOf[js.Any], proxy_type = proxy_type.asInstanceOf[js.Any], proxy_username = proxy_username.asInstanceOf[js.Any], queueing_enabled = queueing_enabled.asInstanceOf[js.Any], random_port = random_port.asInstanceOf[js.Any], rss_auto_downloading_enabled = rss_auto_downloading_enabled.asInstanceOf[js.Any], rss_max_articles_per_feed = rss_max_articles_per_feed.asInstanceOf[js.Any], rss_processing_enabled = rss_processing_enabled.asInstanceOf[js.Any], rss_refresh_interval = rss_refresh_interval.asInstanceOf[js.Any], save_path = save_path.asInstanceOf[js.Any], save_path_changed_tmm_enabled = save_path_changed_tmm_enabled.asInstanceOf[js.Any], scan_dirs = scan_dirs.asInstanceOf[js.Any], schedule_from_hour = schedule_from_hour.asInstanceOf[js.Any], schedule_from_min = schedule_from_min.asInstanceOf[js.Any], schedule_to_hour = schedule_to_hour.asInstanceOf[js.Any], schedule_to_min = schedule_to_min.asInstanceOf[js.Any], scheduler_days = scheduler_days.asInstanceOf[js.Any], scheduler_enabled = scheduler_enabled.asInstanceOf[js.Any], slow_torrent_dl_rate_threshold = slow_torrent_dl_rate_threshold.asInstanceOf[js.Any], slow_torrent_inactive_timer = slow_torrent_inactive_timer.asInstanceOf[js.Any], slow_torrent_ul_rate_threshold = slow_torrent_ul_rate_threshold.asInstanceOf[js.Any], ssl_cert = ssl_cert.asInstanceOf[js.Any], ssl_key = ssl_key.asInstanceOf[js.Any], start_paused_enabled = start_paused_enabled.asInstanceOf[js.Any], temp_path = temp_path.asInstanceOf[js.Any], temp_path_enabled = temp_path_enabled.asInstanceOf[js.Any], torrent_changed_tmm_enabled = torrent_changed_tmm_enabled.asInstanceOf[js.Any], up_limit = up_limit.asInstanceOf[js.Any], upnp = upnp.asInstanceOf[js.Any], use_https = use_https.asInstanceOf[js.Any], web_ui_address = web_ui_address.asInstanceOf[js.Any], web_ui_clickjacking_protection_enabled = web_ui_clickjacking_protection_enabled.asInstanceOf[js.Any], web_ui_csrf_protection_enabled = web_ui_csrf_protection_enabled.asInstanceOf[js.Any], web_ui_domain_list = web_ui_domain_list.asInstanceOf[js.Any], web_ui_password = web_ui_password.asInstanceOf[js.Any], web_ui_port = web_ui_port.asInstanceOf[js.Any], web_ui_upnp = web_ui_upnp.asInstanceOf[js.Any], web_ui_username = web_ui_username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Preferences] (val x: Self) extends AnyVal {
    
    inline def setAlt_dl_limit(value: Double): Self = StObject.set(x, "alt_dl_limit", value.asInstanceOf[js.Any])
    
    inline def setAlt_up_limit(value: Double): Self = StObject.set(x, "alt_up_limit", value.asInstanceOf[js.Any])
    
    inline def setAlternative_webui_enabled(value: Boolean): Self = StObject.set(x, "alternative_webui_enabled", value.asInstanceOf[js.Any])
    
    inline def setAlternative_webui_path(value: String): Self = StObject.set(x, "alternative_webui_path", value.asInstanceOf[js.Any])
    
    inline def setAnonymous_mode(value: Boolean): Self = StObject.set(x, "anonymous_mode", value.asInstanceOf[js.Any])
    
    inline def setAuto_delete_mode(value: Double): Self = StObject.set(x, "auto_delete_mode", value.asInstanceOf[js.Any])
    
    inline def setAuto_tmm_enabled(value: Boolean): Self = StObject.set(x, "auto_tmm_enabled", value.asInstanceOf[js.Any])
    
    inline def setAutorun_enabled(value: Boolean): Self = StObject.set(x, "autorun_enabled", value.asInstanceOf[js.Any])
    
    inline def setAutorun_program(value: String): Self = StObject.set(x, "autorun_program", value.asInstanceOf[js.Any])
    
    inline def setBypass_auth_subnet_whitelist(value: String): Self = StObject.set(x, "bypass_auth_subnet_whitelist", value.asInstanceOf[js.Any])
    
    inline def setBypass_auth_subnet_whitelist_enabled(value: Boolean): Self = StObject.set(x, "bypass_auth_subnet_whitelist_enabled", value.asInstanceOf[js.Any])
    
    inline def setBypass_local_auth(value: Boolean): Self = StObject.set(x, "bypass_local_auth", value.asInstanceOf[js.Any])
    
    inline def setCategory_changed_tmm_enabled(value: Boolean): Self = StObject.set(x, "category_changed_tmm_enabled", value.asInstanceOf[js.Any])
    
    inline def setCreate_subfolder_enabled(value: Boolean): Self = StObject.set(x, "create_subfolder_enabled", value.asInstanceOf[js.Any])
    
    inline def setDht(value: Boolean): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
    
    inline def setDhtSameAsBT(value: Boolean): Self = StObject.set(x, "dhtSameAsBT", value.asInstanceOf[js.Any])
    
    inline def setDht_port(value: Double): Self = StObject.set(x, "dht_port", value.asInstanceOf[js.Any])
    
    inline def setDl_limit(value: Double): Self = StObject.set(x, "dl_limit", value.asInstanceOf[js.Any])
    
    inline def setDont_count_slow_torrents(value: Boolean): Self = StObject.set(x, "dont_count_slow_torrents", value.asInstanceOf[js.Any])
    
    inline def setDyndns_domain(value: String): Self = StObject.set(x, "dyndns_domain", value.asInstanceOf[js.Any])
    
    inline def setDyndns_enabled(value: Boolean): Self = StObject.set(x, "dyndns_enabled", value.asInstanceOf[js.Any])
    
    inline def setDyndns_password(value: String): Self = StObject.set(x, "dyndns_password", value.asInstanceOf[js.Any])
    
    inline def setDyndns_service(value: Double): Self = StObject.set(x, "dyndns_service", value.asInstanceOf[js.Any])
    
    inline def setDyndns_username(value: String): Self = StObject.set(x, "dyndns_username", value.asInstanceOf[js.Any])
    
    inline def setEnable_utp(value: Boolean): Self = StObject.set(x, "enable_utp", value.asInstanceOf[js.Any])
    
    inline def setEncryption(value: Double): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setExport_dir(value: String): Self = StObject.set(x, "export_dir", value.asInstanceOf[js.Any])
    
    inline def setExport_dir_fin(value: String): Self = StObject.set(x, "export_dir_fin", value.asInstanceOf[js.Any])
    
    inline def setForce_proxy(value: Boolean): Self = StObject.set(x, "force_proxy", value.asInstanceOf[js.Any])
    
    inline def setIncomplete_files_ext(value: Boolean): Self = StObject.set(x, "incomplete_files_ext", value.asInstanceOf[js.Any])
    
    inline def setIp_filter_enabled(value: Boolean): Self = StObject.set(x, "ip_filter_enabled", value.asInstanceOf[js.Any])
    
    inline def setIp_filter_path(value: String): Self = StObject.set(x, "ip_filter_path", value.asInstanceOf[js.Any])
    
    inline def setIp_filter_trackers(value: Boolean): Self = StObject.set(x, "ip_filter_trackers", value.asInstanceOf[js.Any])
    
    inline def setLimit_lan_peers(value: Boolean): Self = StObject.set(x, "limit_lan_peers", value.asInstanceOf[js.Any])
    
    inline def setLimit_tcp_overhead(value: Boolean): Self = StObject.set(x, "limit_tcp_overhead", value.asInstanceOf[js.Any])
    
    inline def setLimit_utp_rate(value: Boolean): Self = StObject.set(x, "limit_utp_rate", value.asInstanceOf[js.Any])
    
    inline def setListen_port(value: Double): Self = StObject.set(x, "listen_port", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLsd(value: Boolean): Self = StObject.set(x, "lsd", value.asInstanceOf[js.Any])
    
    inline def setMail_notification_auth_enabled(value: Boolean): Self = StObject.set(x, "mail_notification_auth_enabled", value.asInstanceOf[js.Any])
    
    inline def setMail_notification_email(value: String): Self = StObject.set(x, "mail_notification_email", value.asInstanceOf[js.Any])
    
    inline def setMail_notification_enabled(value: Boolean): Self = StObject.set(x, "mail_notification_enabled", value.asInstanceOf[js.Any])
    
    inline def setMail_notification_password(value: String): Self = StObject.set(x, "mail_notification_password", value.asInstanceOf[js.Any])
    
    inline def setMail_notification_sender(value: String): Self = StObject.set(x, "mail_notification_sender", value.asInstanceOf[js.Any])
    
    inline def setMail_notification_smtp(value: String): Self = StObject.set(x, "mail_notification_smtp", value.asInstanceOf[js.Any])
    
    inline def setMail_notification_ssl_enabled(value: Boolean): Self = StObject.set(x, "mail_notification_ssl_enabled", value.asInstanceOf[js.Any])
    
    inline def setMail_notification_username(value: String): Self = StObject.set(x, "mail_notification_username", value.asInstanceOf[js.Any])
    
    inline def setMax_active_downloads(value: Double): Self = StObject.set(x, "max_active_downloads", value.asInstanceOf[js.Any])
    
    inline def setMax_active_torrents(value: Double): Self = StObject.set(x, "max_active_torrents", value.asInstanceOf[js.Any])
    
    inline def setMax_active_uploads(value: Double): Self = StObject.set(x, "max_active_uploads", value.asInstanceOf[js.Any])
    
    inline def setMax_connec(value: Double): Self = StObject.set(x, "max_connec", value.asInstanceOf[js.Any])
    
    inline def setMax_connec_per_torrent(value: Double): Self = StObject.set(x, "max_connec_per_torrent", value.asInstanceOf[js.Any])
    
    inline def setMax_ratio(value: Double): Self = StObject.set(x, "max_ratio", value.asInstanceOf[js.Any])
    
    inline def setMax_ratio_act(value: Boolean): Self = StObject.set(x, "max_ratio_act", value.asInstanceOf[js.Any])
    
    inline def setMax_ratio_enabled(value: Boolean): Self = StObject.set(x, "max_ratio_enabled", value.asInstanceOf[js.Any])
    
    inline def setMax_uploads(value: Double): Self = StObject.set(x, "max_uploads", value.asInstanceOf[js.Any])
    
    inline def setMax_uploads_per_torrent(value: Double): Self = StObject.set(x, "max_uploads_per_torrent", value.asInstanceOf[js.Any])
    
    inline def setPex(value: Boolean): Self = StObject.set(x, "pex", value.asInstanceOf[js.Any])
    
    inline def setPreallocate_all(value: Boolean): Self = StObject.set(x, "preallocate_all", value.asInstanceOf[js.Any])
    
    inline def setProxy_auth_enabled(value: Boolean): Self = StObject.set(x, "proxy_auth_enabled", value.asInstanceOf[js.Any])
    
    inline def setProxy_ip(value: String): Self = StObject.set(x, "proxy_ip", value.asInstanceOf[js.Any])
    
    inline def setProxy_password(value: String): Self = StObject.set(x, "proxy_password", value.asInstanceOf[js.Any])
    
    inline def setProxy_peer_connections(value: Boolean): Self = StObject.set(x, "proxy_peer_connections", value.asInstanceOf[js.Any])
    
    inline def setProxy_port(value: Double): Self = StObject.set(x, "proxy_port", value.asInstanceOf[js.Any])
    
    inline def setProxy_type(value: Double): Self = StObject.set(x, "proxy_type", value.asInstanceOf[js.Any])
    
    inline def setProxy_username(value: String): Self = StObject.set(x, "proxy_username", value.asInstanceOf[js.Any])
    
    inline def setQueueing_enabled(value: Boolean): Self = StObject.set(x, "queueing_enabled", value.asInstanceOf[js.Any])
    
    inline def setRandom_port(value: Boolean): Self = StObject.set(x, "random_port", value.asInstanceOf[js.Any])
    
    inline def setRss_auto_downloading_enabled(value: Boolean): Self = StObject.set(x, "rss_auto_downloading_enabled", value.asInstanceOf[js.Any])
    
    inline def setRss_max_articles_per_feed(value: Double): Self = StObject.set(x, "rss_max_articles_per_feed", value.asInstanceOf[js.Any])
    
    inline def setRss_processing_enabled(value: Boolean): Self = StObject.set(x, "rss_processing_enabled", value.asInstanceOf[js.Any])
    
    inline def setRss_refresh_interval(value: Double): Self = StObject.set(x, "rss_refresh_interval", value.asInstanceOf[js.Any])
    
    inline def setSave_path(value: String): Self = StObject.set(x, "save_path", value.asInstanceOf[js.Any])
    
    inline def setSave_path_changed_tmm_enabled(value: Boolean): Self = StObject.set(x, "save_path_changed_tmm_enabled", value.asInstanceOf[js.Any])
    
    inline def setScan_dirs(value: js.Object): Self = StObject.set(x, "scan_dirs", value.asInstanceOf[js.Any])
    
    inline def setSchedule_from_hour(value: Double): Self = StObject.set(x, "schedule_from_hour", value.asInstanceOf[js.Any])
    
    inline def setSchedule_from_min(value: Double): Self = StObject.set(x, "schedule_from_min", value.asInstanceOf[js.Any])
    
    inline def setSchedule_to_hour(value: Double): Self = StObject.set(x, "schedule_to_hour", value.asInstanceOf[js.Any])
    
    inline def setSchedule_to_min(value: Double): Self = StObject.set(x, "schedule_to_min", value.asInstanceOf[js.Any])
    
    inline def setScheduler_days(value: Double): Self = StObject.set(x, "scheduler_days", value.asInstanceOf[js.Any])
    
    inline def setScheduler_enabled(value: Boolean): Self = StObject.set(x, "scheduler_enabled", value.asInstanceOf[js.Any])
    
    inline def setSlow_torrent_dl_rate_threshold(value: Double): Self = StObject.set(x, "slow_torrent_dl_rate_threshold", value.asInstanceOf[js.Any])
    
    inline def setSlow_torrent_inactive_timer(value: Double): Self = StObject.set(x, "slow_torrent_inactive_timer", value.asInstanceOf[js.Any])
    
    inline def setSlow_torrent_ul_rate_threshold(value: Double): Self = StObject.set(x, "slow_torrent_ul_rate_threshold", value.asInstanceOf[js.Any])
    
    inline def setSsl_cert(value: String): Self = StObject.set(x, "ssl_cert", value.asInstanceOf[js.Any])
    
    inline def setSsl_key(value: String): Self = StObject.set(x, "ssl_key", value.asInstanceOf[js.Any])
    
    inline def setStart_paused_enabled(value: Boolean): Self = StObject.set(x, "start_paused_enabled", value.asInstanceOf[js.Any])
    
    inline def setTemp_path(value: String): Self = StObject.set(x, "temp_path", value.asInstanceOf[js.Any])
    
    inline def setTemp_path_enabled(value: Boolean): Self = StObject.set(x, "temp_path_enabled", value.asInstanceOf[js.Any])
    
    inline def setTorrent_changed_tmm_enabled(value: Boolean): Self = StObject.set(x, "torrent_changed_tmm_enabled", value.asInstanceOf[js.Any])
    
    inline def setUp_limit(value: Double): Self = StObject.set(x, "up_limit", value.asInstanceOf[js.Any])
    
    inline def setUpnp(value: Boolean): Self = StObject.set(x, "upnp", value.asInstanceOf[js.Any])
    
    inline def setUse_https(value: Boolean): Self = StObject.set(x, "use_https", value.asInstanceOf[js.Any])
    
    inline def setWeb_ui_address(value: String): Self = StObject.set(x, "web_ui_address", value.asInstanceOf[js.Any])
    
    inline def setWeb_ui_clickjacking_protection_enabled(value: Boolean): Self = StObject.set(x, "web_ui_clickjacking_protection_enabled", value.asInstanceOf[js.Any])
    
    inline def setWeb_ui_csrf_protection_enabled(value: Boolean): Self = StObject.set(x, "web_ui_csrf_protection_enabled", value.asInstanceOf[js.Any])
    
    inline def setWeb_ui_domain_list(value: String): Self = StObject.set(x, "web_ui_domain_list", value.asInstanceOf[js.Any])
    
    inline def setWeb_ui_password(value: String): Self = StObject.set(x, "web_ui_password", value.asInstanceOf[js.Any])
    
    inline def setWeb_ui_port(value: Double): Self = StObject.set(x, "web_ui_port", value.asInstanceOf[js.Any])
    
    inline def setWeb_ui_upnp(value: Boolean): Self = StObject.set(x, "web_ui_upnp", value.asInstanceOf[js.Any])
    
    inline def setWeb_ui_username(value: String): Self = StObject.set(x, "web_ui_username", value.asInstanceOf[js.Any])
  }
}
