organization := "org.scalablytyped"
name := "relay-config"
version := "6.0-dt-20190924Z-e44736"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ac6a9e",
  "org.scalablytyped" %%% "relay-compiler" % "7.0-dt-20191126Z-4625a0",
  "org.scalablytyped" %%% "relay-runtime" % "8.0-dt-20200116Z-fb87c2",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "typescript" % "3.7.5-6c2ac7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        