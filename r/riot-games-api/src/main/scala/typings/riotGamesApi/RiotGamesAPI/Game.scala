package typings.riotGamesApi.RiotGamesAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * game-v1.3
  */
object Game {
  
  trait GameDto extends StObject {
    
    var championId: Double
    
    var createDate: Double
    
    var fellowPlayers: js.Array[PlayerDto]
    
    var gameId: Double
    
    var gameMode: String
    
    var gameType: String
    
    var invalid: Boolean
    
    var ipEarned: Double
    
    var level: Double
    
    var mapId: Double
    
    var spell1: Double
    
    var spell2: Double
    
    var stats: RawStatsDto
    
    var subType: String
    
    var teamId: Double
  }
  object GameDto {
    
    inline def apply(
      championId: Double,
      createDate: Double,
      fellowPlayers: js.Array[PlayerDto],
      gameId: Double,
      gameMode: String,
      gameType: String,
      invalid: Boolean,
      ipEarned: Double,
      level: Double,
      mapId: Double,
      spell1: Double,
      spell2: Double,
      stats: RawStatsDto,
      subType: String,
      teamId: Double
    ): GameDto = {
      val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], fellowPlayers = fellowPlayers.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ipEarned = ipEarned.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], spell1 = spell1.asInstanceOf[js.Any], spell2 = spell2.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GameDto]
    }
    
    extension [Self <: GameDto](x: Self) {
      
      inline def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      inline def setCreateDate(value: Double): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      inline def setFellowPlayers(value: js.Array[PlayerDto]): Self = StObject.set(x, "fellowPlayers", value.asInstanceOf[js.Any])
      
      inline def setFellowPlayersVarargs(value: PlayerDto*): Self = StObject.set(x, "fellowPlayers", js.Array(value :_*))
      
      inline def setGameId(value: Double): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
      
      inline def setGameMode(value: String): Self = StObject.set(x, "gameMode", value.asInstanceOf[js.Any])
      
      inline def setGameType(value: String): Self = StObject.set(x, "gameType", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setIpEarned(value: Double): Self = StObject.set(x, "ipEarned", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMapId(value: Double): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      inline def setSpell1(value: Double): Self = StObject.set(x, "spell1", value.asInstanceOf[js.Any])
      
      inline def setSpell2(value: Double): Self = StObject.set(x, "spell2", value.asInstanceOf[js.Any])
      
      inline def setStats(value: RawStatsDto): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
      
      inline def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlayerDto extends StObject {
    
    var championId: Double
    
    var summonerId: Double
    
    var teamId: Double
  }
  object PlayerDto {
    
    inline def apply(championId: Double, summonerId: Double, teamId: Double): PlayerDto = {
      val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerDto]
    }
    
    extension [Self <: PlayerDto](x: Self) {
      
      inline def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
      
      inline def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
      
      inline def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawStatsDto extends StObject {
    
    var assists: Double
    
    var barracksKilled: Double
    
    var championsKilled: Double
    
    var combatPlayerScore: Double
    
    var consumablesPurchased: Double
    
    var damageDealtPlayer: Double
    
    var doubleKills: Double
    
    var firstBlood: Double
    
    var gold: Double
    
    var goldEarned: Double
    
    var goldSpent: Double
    
    var item0: Double
    
    var item1: Double
    
    var item2: Double
    
    var item3: Double
    
    var item4: Double
    
    var item5: Double
    
    var item6: Double
    
    var itemsPurchased: Double
    
    var killingSprees: Double
    
    var largestCriticalStrike: Double
    
    var largestKillingSpree: Double
    
    var largestMultiKill: Double
    
    var legendaryItemsCreated: Double
    
    var level: Double
    
    var magicDamageDealtPlayer: Double
    
    var magicDamageDealtToChampions: Double
    
    var magicDamageTaken: Double
    
    var minionsDenied: Double
    
    var minionsKilled: Double
    
    var neutralMinionsKilled: Double
    
    var neutralMinionsKilledEnemyJungle: Double
    
    var neutralMinionsKilledYourJungle: Double
    
    var nexusKilled: Boolean
    
    var nodeCapture: Double
    
    var nodeCaptureAssist: Double
    
    var nodeNeutralize: Double
    
    var nodeNeutralizeAssist: Double
    
    var numDeaths: Double
    
    var numItemsBought: Double
    
    var objectivePlayerScore: Double
    
    var pentaKills: Double
    
    var physicalDamageDealtPlayer: Double
    
    var physicalDamageDealtToChampions: Double
    
    var physicalDamageTaken: Double
    
    var playerPosition: Double
    
    var playerRole: Double
    
    var quadraKills: Double
    
    var sightWardsBought: Double
    
    var spell1Cast: Double
    
    var spell2Cast: Double
    
    var spell3Cast: Double
    
    var spell4Cast: Double
    
    var summonSpell1Cast: Double
    
    var summonSpell2Cast: Double
    
    var superMonsterKilled: Double
    
    var team: Double
    
    var teamObjective: Double
    
    var timePlayed: Double
    
    var totalDamageDealt: Double
    
    var totalDamageDealtToChampions: Double
    
    var totalDamageTaker: Double
    
    var totalHeal: Double
    
    var totalPlayerScore: Double
    
    var totalScoreRank: Double
    
    var totalTimeCrowdControlDealt: Double
    
    var totalUnitsHealed: Double
    
    var tripleKills: Double
    
    var trueDamageDealtPlayer: Double
    
    var trueDamageDealtToChampions: Double
    
    var trueDamageTaken: Double
    
    var turrentsKilled: Double
    
    var unrealKills: Double
    
    var victoryPointTotal: Double
    
    var visionWardsBought: Double
    
    var wardKilled: Double
    
    var wardPlaced: Double
    
    var win: Boolean
  }
  object RawStatsDto {
    
    inline def apply(
      assists: Double,
      barracksKilled: Double,
      championsKilled: Double,
      combatPlayerScore: Double,
      consumablesPurchased: Double,
      damageDealtPlayer: Double,
      doubleKills: Double,
      firstBlood: Double,
      gold: Double,
      goldEarned: Double,
      goldSpent: Double,
      item0: Double,
      item1: Double,
      item2: Double,
      item3: Double,
      item4: Double,
      item5: Double,
      item6: Double,
      itemsPurchased: Double,
      killingSprees: Double,
      largestCriticalStrike: Double,
      largestKillingSpree: Double,
      largestMultiKill: Double,
      legendaryItemsCreated: Double,
      level: Double,
      magicDamageDealtPlayer: Double,
      magicDamageDealtToChampions: Double,
      magicDamageTaken: Double,
      minionsDenied: Double,
      minionsKilled: Double,
      neutralMinionsKilled: Double,
      neutralMinionsKilledEnemyJungle: Double,
      neutralMinionsKilledYourJungle: Double,
      nexusKilled: Boolean,
      nodeCapture: Double,
      nodeCaptureAssist: Double,
      nodeNeutralize: Double,
      nodeNeutralizeAssist: Double,
      numDeaths: Double,
      numItemsBought: Double,
      objectivePlayerScore: Double,
      pentaKills: Double,
      physicalDamageDealtPlayer: Double,
      physicalDamageDealtToChampions: Double,
      physicalDamageTaken: Double,
      playerPosition: Double,
      playerRole: Double,
      quadraKills: Double,
      sightWardsBought: Double,
      spell1Cast: Double,
      spell2Cast: Double,
      spell3Cast: Double,
      spell4Cast: Double,
      summonSpell1Cast: Double,
      summonSpell2Cast: Double,
      superMonsterKilled: Double,
      team: Double,
      teamObjective: Double,
      timePlayed: Double,
      totalDamageDealt: Double,
      totalDamageDealtToChampions: Double,
      totalDamageTaker: Double,
      totalHeal: Double,
      totalPlayerScore: Double,
      totalScoreRank: Double,
      totalTimeCrowdControlDealt: Double,
      totalUnitsHealed: Double,
      tripleKills: Double,
      trueDamageDealtPlayer: Double,
      trueDamageDealtToChampions: Double,
      trueDamageTaken: Double,
      turrentsKilled: Double,
      unrealKills: Double,
      victoryPointTotal: Double,
      visionWardsBought: Double,
      wardKilled: Double,
      wardPlaced: Double,
      win: Boolean
    ): RawStatsDto = {
      val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], barracksKilled = barracksKilled.asInstanceOf[js.Any], championsKilled = championsKilled.asInstanceOf[js.Any], combatPlayerScore = combatPlayerScore.asInstanceOf[js.Any], consumablesPurchased = consumablesPurchased.asInstanceOf[js.Any], damageDealtPlayer = damageDealtPlayer.asInstanceOf[js.Any], doubleKills = doubleKills.asInstanceOf[js.Any], firstBlood = firstBlood.asInstanceOf[js.Any], gold = gold.asInstanceOf[js.Any], goldEarned = goldEarned.asInstanceOf[js.Any], goldSpent = goldSpent.asInstanceOf[js.Any], item0 = item0.asInstanceOf[js.Any], item1 = item1.asInstanceOf[js.Any], item2 = item2.asInstanceOf[js.Any], item3 = item3.asInstanceOf[js.Any], item4 = item4.asInstanceOf[js.Any], item5 = item5.asInstanceOf[js.Any], item6 = item6.asInstanceOf[js.Any], itemsPurchased = itemsPurchased.asInstanceOf[js.Any], killingSprees = killingSprees.asInstanceOf[js.Any], largestCriticalStrike = largestCriticalStrike.asInstanceOf[js.Any], largestKillingSpree = largestKillingSpree.asInstanceOf[js.Any], largestMultiKill = largestMultiKill.asInstanceOf[js.Any], legendaryItemsCreated = legendaryItemsCreated.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], magicDamageDealtPlayer = magicDamageDealtPlayer.asInstanceOf[js.Any], magicDamageDealtToChampions = magicDamageDealtToChampions.asInstanceOf[js.Any], magicDamageTaken = magicDamageTaken.asInstanceOf[js.Any], minionsDenied = minionsDenied.asInstanceOf[js.Any], minionsKilled = minionsKilled.asInstanceOf[js.Any], neutralMinionsKilled = neutralMinionsKilled.asInstanceOf[js.Any], neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle.asInstanceOf[js.Any], neutralMinionsKilledYourJungle = neutralMinionsKilledYourJungle.asInstanceOf[js.Any], nexusKilled = nexusKilled.asInstanceOf[js.Any], nodeCapture = nodeCapture.asInstanceOf[js.Any], nodeCaptureAssist = nodeCaptureAssist.asInstanceOf[js.Any], nodeNeutralize = nodeNeutralize.asInstanceOf[js.Any], nodeNeutralizeAssist = nodeNeutralizeAssist.asInstanceOf[js.Any], numDeaths = numDeaths.asInstanceOf[js.Any], numItemsBought = numItemsBought.asInstanceOf[js.Any], objectivePlayerScore = objectivePlayerScore.asInstanceOf[js.Any], pentaKills = pentaKills.asInstanceOf[js.Any], physicalDamageDealtPlayer = physicalDamageDealtPlayer.asInstanceOf[js.Any], physicalDamageDealtToChampions = physicalDamageDealtToChampions.asInstanceOf[js.Any], physicalDamageTaken = physicalDamageTaken.asInstanceOf[js.Any], playerPosition = playerPosition.asInstanceOf[js.Any], playerRole = playerRole.asInstanceOf[js.Any], quadraKills = quadraKills.asInstanceOf[js.Any], sightWardsBought = sightWardsBought.asInstanceOf[js.Any], spell1Cast = spell1Cast.asInstanceOf[js.Any], spell2Cast = spell2Cast.asInstanceOf[js.Any], spell3Cast = spell3Cast.asInstanceOf[js.Any], spell4Cast = spell4Cast.asInstanceOf[js.Any], summonSpell1Cast = summonSpell1Cast.asInstanceOf[js.Any], summonSpell2Cast = summonSpell2Cast.asInstanceOf[js.Any], superMonsterKilled = superMonsterKilled.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], teamObjective = teamObjective.asInstanceOf[js.Any], timePlayed = timePlayed.asInstanceOf[js.Any], totalDamageDealt = totalDamageDealt.asInstanceOf[js.Any], totalDamageDealtToChampions = totalDamageDealtToChampions.asInstanceOf[js.Any], totalDamageTaker = totalDamageTaker.asInstanceOf[js.Any], totalHeal = totalHeal.asInstanceOf[js.Any], totalPlayerScore = totalPlayerScore.asInstanceOf[js.Any], totalScoreRank = totalScoreRank.asInstanceOf[js.Any], totalTimeCrowdControlDealt = totalTimeCrowdControlDealt.asInstanceOf[js.Any], totalUnitsHealed = totalUnitsHealed.asInstanceOf[js.Any], tripleKills = tripleKills.asInstanceOf[js.Any], trueDamageDealtPlayer = trueDamageDealtPlayer.asInstanceOf[js.Any], trueDamageDealtToChampions = trueDamageDealtToChampions.asInstanceOf[js.Any], trueDamageTaken = trueDamageTaken.asInstanceOf[js.Any], turrentsKilled = turrentsKilled.asInstanceOf[js.Any], unrealKills = unrealKills.asInstanceOf[js.Any], victoryPointTotal = victoryPointTotal.asInstanceOf[js.Any], visionWardsBought = visionWardsBought.asInstanceOf[js.Any], wardKilled = wardKilled.asInstanceOf[js.Any], wardPlaced = wardPlaced.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawStatsDto]
    }
    
    extension [Self <: RawStatsDto](x: Self) {
      
      inline def setAssists(value: Double): Self = StObject.set(x, "assists", value.asInstanceOf[js.Any])
      
      inline def setBarracksKilled(value: Double): Self = StObject.set(x, "barracksKilled", value.asInstanceOf[js.Any])
      
      inline def setChampionsKilled(value: Double): Self = StObject.set(x, "championsKilled", value.asInstanceOf[js.Any])
      
      inline def setCombatPlayerScore(value: Double): Self = StObject.set(x, "combatPlayerScore", value.asInstanceOf[js.Any])
      
      inline def setConsumablesPurchased(value: Double): Self = StObject.set(x, "consumablesPurchased", value.asInstanceOf[js.Any])
      
      inline def setDamageDealtPlayer(value: Double): Self = StObject.set(x, "damageDealtPlayer", value.asInstanceOf[js.Any])
      
      inline def setDoubleKills(value: Double): Self = StObject.set(x, "doubleKills", value.asInstanceOf[js.Any])
      
      inline def setFirstBlood(value: Double): Self = StObject.set(x, "firstBlood", value.asInstanceOf[js.Any])
      
      inline def setGold(value: Double): Self = StObject.set(x, "gold", value.asInstanceOf[js.Any])
      
      inline def setGoldEarned(value: Double): Self = StObject.set(x, "goldEarned", value.asInstanceOf[js.Any])
      
      inline def setGoldSpent(value: Double): Self = StObject.set(x, "goldSpent", value.asInstanceOf[js.Any])
      
      inline def setItem0(value: Double): Self = StObject.set(x, "item0", value.asInstanceOf[js.Any])
      
      inline def setItem1(value: Double): Self = StObject.set(x, "item1", value.asInstanceOf[js.Any])
      
      inline def setItem2(value: Double): Self = StObject.set(x, "item2", value.asInstanceOf[js.Any])
      
      inline def setItem3(value: Double): Self = StObject.set(x, "item3", value.asInstanceOf[js.Any])
      
      inline def setItem4(value: Double): Self = StObject.set(x, "item4", value.asInstanceOf[js.Any])
      
      inline def setItem5(value: Double): Self = StObject.set(x, "item5", value.asInstanceOf[js.Any])
      
      inline def setItem6(value: Double): Self = StObject.set(x, "item6", value.asInstanceOf[js.Any])
      
      inline def setItemsPurchased(value: Double): Self = StObject.set(x, "itemsPurchased", value.asInstanceOf[js.Any])
      
      inline def setKillingSprees(value: Double): Self = StObject.set(x, "killingSprees", value.asInstanceOf[js.Any])
      
      inline def setLargestCriticalStrike(value: Double): Self = StObject.set(x, "largestCriticalStrike", value.asInstanceOf[js.Any])
      
      inline def setLargestKillingSpree(value: Double): Self = StObject.set(x, "largestKillingSpree", value.asInstanceOf[js.Any])
      
      inline def setLargestMultiKill(value: Double): Self = StObject.set(x, "largestMultiKill", value.asInstanceOf[js.Any])
      
      inline def setLegendaryItemsCreated(value: Double): Self = StObject.set(x, "legendaryItemsCreated", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMagicDamageDealtPlayer(value: Double): Self = StObject.set(x, "magicDamageDealtPlayer", value.asInstanceOf[js.Any])
      
      inline def setMagicDamageDealtToChampions(value: Double): Self = StObject.set(x, "magicDamageDealtToChampions", value.asInstanceOf[js.Any])
      
      inline def setMagicDamageTaken(value: Double): Self = StObject.set(x, "magicDamageTaken", value.asInstanceOf[js.Any])
      
      inline def setMinionsDenied(value: Double): Self = StObject.set(x, "minionsDenied", value.asInstanceOf[js.Any])
      
      inline def setMinionsKilled(value: Double): Self = StObject.set(x, "minionsKilled", value.asInstanceOf[js.Any])
      
      inline def setNeutralMinionsKilled(value: Double): Self = StObject.set(x, "neutralMinionsKilled", value.asInstanceOf[js.Any])
      
      inline def setNeutralMinionsKilledEnemyJungle(value: Double): Self = StObject.set(x, "neutralMinionsKilledEnemyJungle", value.asInstanceOf[js.Any])
      
      inline def setNeutralMinionsKilledYourJungle(value: Double): Self = StObject.set(x, "neutralMinionsKilledYourJungle", value.asInstanceOf[js.Any])
      
      inline def setNexusKilled(value: Boolean): Self = StObject.set(x, "nexusKilled", value.asInstanceOf[js.Any])
      
      inline def setNodeCapture(value: Double): Self = StObject.set(x, "nodeCapture", value.asInstanceOf[js.Any])
      
      inline def setNodeCaptureAssist(value: Double): Self = StObject.set(x, "nodeCaptureAssist", value.asInstanceOf[js.Any])
      
      inline def setNodeNeutralize(value: Double): Self = StObject.set(x, "nodeNeutralize", value.asInstanceOf[js.Any])
      
      inline def setNodeNeutralizeAssist(value: Double): Self = StObject.set(x, "nodeNeutralizeAssist", value.asInstanceOf[js.Any])
      
      inline def setNumDeaths(value: Double): Self = StObject.set(x, "numDeaths", value.asInstanceOf[js.Any])
      
      inline def setNumItemsBought(value: Double): Self = StObject.set(x, "numItemsBought", value.asInstanceOf[js.Any])
      
      inline def setObjectivePlayerScore(value: Double): Self = StObject.set(x, "objectivePlayerScore", value.asInstanceOf[js.Any])
      
      inline def setPentaKills(value: Double): Self = StObject.set(x, "pentaKills", value.asInstanceOf[js.Any])
      
      inline def setPhysicalDamageDealtPlayer(value: Double): Self = StObject.set(x, "physicalDamageDealtPlayer", value.asInstanceOf[js.Any])
      
      inline def setPhysicalDamageDealtToChampions(value: Double): Self = StObject.set(x, "physicalDamageDealtToChampions", value.asInstanceOf[js.Any])
      
      inline def setPhysicalDamageTaken(value: Double): Self = StObject.set(x, "physicalDamageTaken", value.asInstanceOf[js.Any])
      
      inline def setPlayerPosition(value: Double): Self = StObject.set(x, "playerPosition", value.asInstanceOf[js.Any])
      
      inline def setPlayerRole(value: Double): Self = StObject.set(x, "playerRole", value.asInstanceOf[js.Any])
      
      inline def setQuadraKills(value: Double): Self = StObject.set(x, "quadraKills", value.asInstanceOf[js.Any])
      
      inline def setSightWardsBought(value: Double): Self = StObject.set(x, "sightWardsBought", value.asInstanceOf[js.Any])
      
      inline def setSpell1Cast(value: Double): Self = StObject.set(x, "spell1Cast", value.asInstanceOf[js.Any])
      
      inline def setSpell2Cast(value: Double): Self = StObject.set(x, "spell2Cast", value.asInstanceOf[js.Any])
      
      inline def setSpell3Cast(value: Double): Self = StObject.set(x, "spell3Cast", value.asInstanceOf[js.Any])
      
      inline def setSpell4Cast(value: Double): Self = StObject.set(x, "spell4Cast", value.asInstanceOf[js.Any])
      
      inline def setSummonSpell1Cast(value: Double): Self = StObject.set(x, "summonSpell1Cast", value.asInstanceOf[js.Any])
      
      inline def setSummonSpell2Cast(value: Double): Self = StObject.set(x, "summonSpell2Cast", value.asInstanceOf[js.Any])
      
      inline def setSuperMonsterKilled(value: Double): Self = StObject.set(x, "superMonsterKilled", value.asInstanceOf[js.Any])
      
      inline def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      inline def setTeamObjective(value: Double): Self = StObject.set(x, "teamObjective", value.asInstanceOf[js.Any])
      
      inline def setTimePlayed(value: Double): Self = StObject.set(x, "timePlayed", value.asInstanceOf[js.Any])
      
      inline def setTotalDamageDealt(value: Double): Self = StObject.set(x, "totalDamageDealt", value.asInstanceOf[js.Any])
      
      inline def setTotalDamageDealtToChampions(value: Double): Self = StObject.set(x, "totalDamageDealtToChampions", value.asInstanceOf[js.Any])
      
      inline def setTotalDamageTaker(value: Double): Self = StObject.set(x, "totalDamageTaker", value.asInstanceOf[js.Any])
      
      inline def setTotalHeal(value: Double): Self = StObject.set(x, "totalHeal", value.asInstanceOf[js.Any])
      
      inline def setTotalPlayerScore(value: Double): Self = StObject.set(x, "totalPlayerScore", value.asInstanceOf[js.Any])
      
      inline def setTotalScoreRank(value: Double): Self = StObject.set(x, "totalScoreRank", value.asInstanceOf[js.Any])
      
      inline def setTotalTimeCrowdControlDealt(value: Double): Self = StObject.set(x, "totalTimeCrowdControlDealt", value.asInstanceOf[js.Any])
      
      inline def setTotalUnitsHealed(value: Double): Self = StObject.set(x, "totalUnitsHealed", value.asInstanceOf[js.Any])
      
      inline def setTripleKills(value: Double): Self = StObject.set(x, "tripleKills", value.asInstanceOf[js.Any])
      
      inline def setTrueDamageDealtPlayer(value: Double): Self = StObject.set(x, "trueDamageDealtPlayer", value.asInstanceOf[js.Any])
      
      inline def setTrueDamageDealtToChampions(value: Double): Self = StObject.set(x, "trueDamageDealtToChampions", value.asInstanceOf[js.Any])
      
      inline def setTrueDamageTaken(value: Double): Self = StObject.set(x, "trueDamageTaken", value.asInstanceOf[js.Any])
      
      inline def setTurrentsKilled(value: Double): Self = StObject.set(x, "turrentsKilled", value.asInstanceOf[js.Any])
      
      inline def setUnrealKills(value: Double): Self = StObject.set(x, "unrealKills", value.asInstanceOf[js.Any])
      
      inline def setVictoryPointTotal(value: Double): Self = StObject.set(x, "victoryPointTotal", value.asInstanceOf[js.Any])
      
      inline def setVisionWardsBought(value: Double): Self = StObject.set(x, "visionWardsBought", value.asInstanceOf[js.Any])
      
      inline def setWardKilled(value: Double): Self = StObject.set(x, "wardKilled", value.asInstanceOf[js.Any])
      
      inline def setWardPlaced(value: Double): Self = StObject.set(x, "wardPlaced", value.asInstanceOf[js.Any])
      
      inline def setWin(value: Boolean): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecentGamesDto extends StObject {
    
    var games: js.Array[GameDto]
    
    var summonerId: Double
  }
  object RecentGamesDto {
    
    inline def apply(games: js.Array[GameDto], summonerId: Double): RecentGamesDto = {
      val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecentGamesDto]
    }
    
    extension [Self <: RecentGamesDto](x: Self) {
      
      inline def setGames(value: js.Array[GameDto]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
      
      inline def setGamesVarargs(value: GameDto*): Self = StObject.set(x, "games", js.Array(value :_*))
      
      inline def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
    }
  }
}
