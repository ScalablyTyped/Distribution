package typings.qbittorrentApiV2.mod

import typings.qbittorrentApiV2.qbittorrentApiV2Ints.`0`
import typings.qbittorrentApiV2.qbittorrentApiV2Ints.`1`
import typings.qbittorrentApiV2.qbittorrentApiV2Ints.`2`
import typings.qbittorrentApiV2.qbittorrentApiV2Ints.`6`
import typings.qbittorrentApiV2.qbittorrentApiV2Ints.`7`
import typings.qbittorrentApiV2.qbittorrentApiV2Strings.all
import typings.qbittorrentApiV2.qbittorrentApiV2Strings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QBittorrentApiEndpoint extends StObject {
  
  def addPeers(hashes: String, peers: String): js.Promise[Unit] = js.native
  
  def addTags(hashes: String, tags: String): js.Promise[Unit] = js.native
  
  def addTrackers(hash: String, urls: String): js.Promise[Unit] = js.native
  
  def apiVersion(): js.Promise[String] = js.native
  
  def appVersion(): js.Promise[String] = js.native
  
  def banPeers(peers: String): js.Promise[Unit] = js.native
  
  def buildInfo(): js.Promise[BuildInfo] = js.native
  
  def categories(): js.Promise[Categories] = js.native
  
  def createCategory(category: String, savePath: String): js.Promise[Unit] = js.native
  
  def createTags(tags: String): js.Promise[Unit] = js.native
  
  def decreasePriority(hashes: String): js.Promise[Unit] = js.native
  
  def defaultSavePath(): js.Promise[String] = js.native
  
  def deleteSearch(id: Double): js.Promise[Unit] = js.native
  
  def deleteTags(tags: String): js.Promise[Unit] = js.native
  
  def deleteTorrents(hashes: String, deleteFile: Boolean): js.Promise[Unit] = js.native
  
  def downloadLimit(hashes: String): js.Promise[Unit] = js.native
  
  def editCategory(category: String, savePath: String): js.Promise[Unit] = js.native
  
  def editTrackers(hash: String, origUrl: String, newUrl: String): js.Promise[Unit] = js.native
  
  def enablePlugin(names: String, enable: Boolean): js.Promise[Unit] = js.native
  
  def files(hash: String): js.Promise[js.Array[Content]] = js.native
  
  def globalDownloadLimit(): js.Promise[Double] = js.native
  
  def globalUploadLimit(): js.Promise[Double] = js.native
  
  def increasePriority(hashes: String): js.Promise[Unit] = js.native
  
  def installPlugin(sources: String): js.Promise[Unit] = js.native
  
  def log(): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Boolean, warning: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Boolean, warning: Boolean, critical: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Boolean, warning: Boolean, critical: Boolean, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Boolean, warning: Boolean, critical: Unit, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Boolean, warning: Unit, critical: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Boolean, warning: Unit, critical: Boolean, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Boolean, warning: Unit, critical: Unit, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Unit, warning: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Unit, warning: Boolean, critical: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Unit, warning: Boolean, critical: Boolean, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Unit, warning: Boolean, critical: Unit, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Unit, warning: Unit, critical: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Unit, warning: Unit, critical: Boolean, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Boolean, info: Unit, warning: Unit, critical: Unit, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Boolean, warning: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Boolean, warning: Boolean, critical: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Boolean, warning: Boolean, critical: Boolean, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Boolean, warning: Boolean, critical: Unit, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Boolean, warning: Unit, critical: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Boolean, warning: Unit, critical: Boolean, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Boolean, warning: Unit, critical: Unit, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Unit, warning: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Unit, warning: Boolean, critical: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Unit, warning: Boolean, critical: Boolean, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Unit, warning: Boolean, critical: Unit, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Unit, warning: Unit, critical: Boolean): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Unit, warning: Unit, critical: Boolean, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  def log(normal: Unit, info: Unit, warning: Unit, critical: Unit, lastKnownId: Double): js.Promise[js.Array[Log]] = js.native
  
  def maxPriority(hashes: String): js.Promise[Unit] = js.native
  
  def minPriority(hashes: String): js.Promise[Unit] = js.native
  
  def pauseTorrents(hashes: String): js.Promise[Unit] = js.native
  
  def peerLog(): js.Promise[js.Array[PeerLog]] = js.native
  def peerLog(lastKnownId: Double): js.Promise[js.Array[PeerLog]] = js.native
  
  def pieceHashes(hash: String): js.Promise[js.Array[String]] = js.native
  
  def pieceStates(hash: String): js.Promise[js.Array[`0` | `1` | `2`]] = js.native
  
  def preferences(): js.Promise[Preferences] = js.native
  
  def properties(hash: String): js.Promise[TorrentInfo] = js.native
  
  def reannounceTorrents(hashes: String): js.Promise[Unit] = js.native
  
  def recheckTorrents(hashes: String): js.Promise[Unit] = js.native
  
  def removeCategories(categories: String): js.Promise[Unit] = js.native
  
  def removeTags(hashes: String, tags: String): js.Promise[Unit] = js.native
  
  def removeTrackers(hash: String, urls: String): js.Promise[Unit] = js.native
  
  def rename(hash: String, name: String): js.Promise[Unit] = js.native
  
  def renameFile(hash: String, id: Double, name: String): js.Promise[Unit] = js.native
  
  def resumeTorrents(hashes: String): js.Promise[Unit] = js.native
  
  def searchCategories(): js.Promise[js.Array[String]] = js.native
  def searchCategories(pluginName: all | enabled): js.Promise[js.Array[String]] = js.native
  def searchCategories(pluginName: String): js.Promise[js.Array[String]] = js.native
  
  def searchPlugins(): js.Promise[js.Array[SearchPlugin]] = js.native
  
  def searchResults(id: Double): js.Promise[SearchResults] = js.native
  def searchResults(id: Double, limit: Double): js.Promise[SearchResults] = js.native
  def searchResults(id: Double, limit: Double, offset: Double): js.Promise[SearchResults] = js.native
  def searchResults(id: Double, limit: Unit, offset: Double): js.Promise[SearchResults] = js.native
  
  def searchStatus(): js.Promise[js.Array[SearchStatus]] = js.native
  def searchStatus(id: Double): js.Promise[js.Array[SearchStatus]] = js.native
  
  def setAutoManagement(hashes: String, enable: Boolean): js.Promise[Unit] = js.native
  
  def setCategory(hashes: String, category: String): js.Promise[Unit] = js.native
  
  def setDownloadLimit(hashes: String, limit: String): js.Promise[Unit] = js.native
  
  def setFilePriority(hash: String, id: String, priority: `0` | `1` | `6` | `7`): js.Promise[Unit] = js.native
  
  def setForceStart(hashes: String, value: Boolean): js.Promise[Unit] = js.native
  
  def setGlobalDownloadLimit(limit: Double): js.Promise[Unit] = js.native
  
  def setGlobalUploadLimit(limit: Double): js.Promise[Unit] = js.native
  
  def setLocation(hashes: String, location: String): js.Promise[Unit] = js.native
  
  def setShareLimit(hashes: String, ratioLimit: String, seedingTimeLimit: String): js.Promise[Unit] = js.native
  
  def setSuperSeeding(hashes: String, value: Boolean): js.Promise[Unit] = js.native
  
  def setUploadLimit(hashes: String, limit: String): js.Promise[Unit] = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  
  def speedLimitsMode(): js.Promise[Double] = js.native
  
  def startSearch(pattern: String, plugins: String, category: String): js.Promise[SearchJob] = js.native
  
  def stopSearch(id: Double): js.Promise[Unit] = js.native
  
  def syncMainData(): js.Promise[MainData] = js.native
  def syncMainData(rid: Double): js.Promise[MainData] = js.native
  
  def syncPeersData(hash: String): js.Promise[PeerData] = js.native
  def syncPeersData(hash: String, rid: Double): js.Promise[PeerData] = js.native
  
  def tags(): js.Promise[js.Array[String]] = js.native
  
  def toggleFirstLastPiecePrio(hashes: String): js.Promise[Unit] = js.native
  
  def toggleSequentialDownload(hashes: String): js.Promise[Unit] = js.native
  
  def toggleSpeedLimitsMode(): js.Promise[Unit] = js.native
  
  def torrents(
    filter: js.UndefOr[filterString],
    category: js.UndefOr[String],
    sort: js.UndefOr[String],
    reverse: js.UndefOr[Boolean],
    limit: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    hashes: js.UndefOr[String]
  ): js.Promise[js.Array[Torrent]] = js.native
  
  def trackers(hash: String): js.Promise[js.Array[Tracker]] = js.native
  
  def transferInfo(): js.Promise[TransferInfo] = js.native
  
  def uninstallPlugin(names: String): js.Promise[Unit] = js.native
  
  def updatePlugins(): js.Promise[Unit] = js.native
  
  def uploadLimit(hashes: String): js.Promise[Unit] = js.native
  
  def webseeds(hash: String): js.Promise[js.Array[Webseed]] = js.native
}
