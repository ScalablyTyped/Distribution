organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-5ed0c2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.0-1b4c05",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-6ba005",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-3ca32d",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-ae65c6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        